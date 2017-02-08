package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class SimpleMessageEvent extends MessageEvent<Message> {
	public SimpleMessageEvent(GsonMessage message) {
		super(message);
	}

	@Override
	public Message convert(GsonMessage msg) {
		return new Message(msg);
	}
}
