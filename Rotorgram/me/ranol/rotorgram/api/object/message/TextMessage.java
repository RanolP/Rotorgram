package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.message.builder.TextMessageBuilder;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class TextMessage extends Message {
	public TextMessage(GsonMessage message) {
		super(message);
	}

	public String getText() {
		return message.text;
	}

	public TextMessageBuilder builder() {
		return new TextMessageBuilder().message(getText());
	}
}
