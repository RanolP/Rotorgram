package me.ranol.rotorgram.api.functions;

import com.google.gson.JsonElement;
import me.ranol.rotorgram.Requester;
import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.AttributeKey;

import java.util.HashMap;

public abstract class TelegramFunction<T> extends TelegramObject {
	protected static final AttributeKey<String> FUNCTION_NAME = new AttributeKey<>("function_name", String.class);

	public T invoke() {
		return deserialize(Requester.request(get(FUNCTION_NAME), getArguments()));
	}

	protected void setFunctionName(String name) {
		set(FUNCTION_NAME, name);
	}

	protected abstract T deserialize(JsonElement e);

	protected abstract HashMap<String, String> getArguments();
}
