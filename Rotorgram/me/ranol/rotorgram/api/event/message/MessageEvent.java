package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.event.CallableEvent;
import me.ranol.rotorgram.api.object.chat.Chat;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;
import me.ranol.rotorgram.api.object.users.User;

public class MessageEvent<T extends Message> extends CallableEvent {
	private final T message;

	public MessageEvent(T message) {
		this.message = message;
	}

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
