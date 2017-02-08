package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.Chat;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;

public abstract class MessageEvent<T extends Message> extends CallableEvent {
	private final T message;

	public MessageEvent(GsonMessage message) {
		this.message = convert(message);
	}

	public abstract T convert(GsonMessage msg);

	public T getMessage() {
		return message;
	}

	public boolean hasChat() {
		return getMessage().hasChat();
	}

	public Chat getChat() {
		return getMessage().getChat();
	}

	public User getMessageSender() {
		return getMessage().getFrom();
	}

	public boolean hasMessageSender() {
		return getMessageSender() != null;
	}

	public MessageType getMessageType() {
		return getMessage().getType();
	}
}
