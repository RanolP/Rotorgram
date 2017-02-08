package me.ranol.rotorgram;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import me.ranol.rotorgram.api.event.UpdateEvent;
import me.ranol.rotorgram.gson.GsonUpdate;

import java.util.Timer;

public class UpdateLooper {
	private Timer timer;
	private long offset = 0;

	public UpdateLooper() {
		start();
	}

	public void stop() {
		timer.cancel();
		timer = null;
	}

	public void start() {
		timer = Static.loopTask(() -> {
			JsonElement e = Requester.getUpdates(offset + 1);
			if (!e.isJsonObject()) return;
			JsonObject o = e.getAsJsonObject();
			if (getBoolean(o, "ok")) {
				long last = offset;
				for (GsonUpdate u : GsonManager.parse(o.get("result"), GsonUpdate[].class)) {
					if (u.id <= offset) continue;
					if (u.id > last) last = u.id;
					new Thread(() -> Static.callEvent(new UpdateEvent(u))).start();
				}
				if (offset < last) offset = last;
			}
		}, 1);
	}

	public static boolean hasBoolean(JsonObject o, String key) {
		return o.has(key) && isBoolean(o.get(key));
	}

	public static boolean getBoolean(JsonObject o, String key) {
		return hasBoolean(o, key) ? getBoolean(o.get(key)) : false;
	}

	public static boolean isBoolean(JsonElement e) {
		return e.isJsonPrimitive() && e.getAsJsonPrimitive()
									   .isBoolean();
	}

	public static boolean getBoolean(JsonElement e) {
		return isBoolean(e) ? e.getAsBoolean() : false;
	}
}
