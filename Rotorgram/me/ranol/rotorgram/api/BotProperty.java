package me.ranol.rotorgram.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import me.ranol.rotorgram.GsonManager;

import java.io.File;
import java.util.Map.Entry;
import java.util.Set;

public class BotProperty {
	JsonObject prop = new JsonObject();
	File target;

	public BotProperty(File f) {
		target = f;
		load();
	}

	public void load() {
		if (!target.exists()) {
			try {
				target.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		prop = GsonManager.load(target);
	}

	public void save() {
		GsonManager.save(prop, target);
	}

	public JsonElement get(String key) {
		if (containsKey(key)) return prop.get(key);
		return null;
	}

	public boolean containsKey(String key) {
		return prop.has(key);
	}

	public <T> T get(String key, Class<T> clazz, T def) {
		JsonElement got = get(key);
		return got == null || got.isJsonNull() ? def : GsonManager.parse(got, clazz);
	}

	public String getString(String key) {
		return getString(key, "");
	}

	public String getString(String key, String def) {
		return get(key, String.class, def);
	}

	public int getInt(String key) {
		return getInt(key, 0);
	}

	public int getInt(String key, int def) {
		return get(key, int.class, def);
	}

	public long getLong(String key) {
		return getLong(key, 0L);
	}

	public long getLong(String key, long def) {
		return get(key, long.class, def);
	}

	public double getDouble(String key) {
		return getDouble(key, 0d);
	}

	public double getDouble(String key, double def) {
		return get(key, double.class, def);
	}

	public boolean getBoolean(String key) {
		return getBoolean(key, false);
	}

	public boolean getBoolean(String key, boolean def) {
		return get(key, boolean.class, def);
	}

	public void set(String key, Object value) {
		prop.add(key, GsonManager.parse(value));
	}

	public Set<Entry<String, JsonElement>> entrySet() {
		return prop.entrySet();
	}

	public JsonObject handle() {
		return prop;
	}
}
