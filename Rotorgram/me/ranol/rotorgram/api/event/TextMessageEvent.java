package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.TextMessage;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class TextMessageEvent extends MessageEvent<TextMessage> {

	public TextMessageEvent(GsonMessage message) {
		super(message);
	}

	public String getMessageText() {
		return getMessage().getText();
	}

	@Override
	public TextMessage convert(GsonMessage msg) {
		return new TextMessage(msg);
	}
}
