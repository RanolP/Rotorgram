package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.TextMessage;

public class TextMessageEvent extends MessageEvent<TextMessage> {
	public TextMessageEvent(TextMessage message) {
		super(message);
	}

	public String getMessageText() {
		return getMessage().getText();
	}
}
