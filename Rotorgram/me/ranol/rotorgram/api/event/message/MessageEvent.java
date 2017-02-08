package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.event.CallableEvent;
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

	public long getChatId() {
		return getChat().getId();
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
