package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.gson.message.GsonMessage;

public class TextMessage extends Message {
	public TextMessage(GsonMessage message) {
		super(message);
	}

	public String getText() {
		return message.text;
	}
}
