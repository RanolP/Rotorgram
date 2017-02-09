package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.object.message.Message;

public class SimpleMessageEvent extends MessageEvent<Message> {
	public SimpleMessageEvent(Message message) {
		super(message);
	}
}
