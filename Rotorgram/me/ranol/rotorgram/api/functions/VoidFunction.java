package me.ranol.rotorgram.api.functions;

import com.google.gson.JsonElement;

public abstract class VoidFunction extends TelegramFunction<Void> {
	@Override
	protected Void deserialize(JsonElement e) {
		return null;
	}
}
