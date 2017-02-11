package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.Update;
import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;

public class UpdateEvent extends CallableEvent {
	private final Update update;

	public UpdateEvent(Update update) {
		this.update = update;
	}

	public Update getUpdate() {
		return update;
	}

	public boolean hasInlineQuery() {
		return update.hasInlineQuery();
	}

	public InlineQuery getInlineQuery() {
		return update.getInlineQuery();
	}

	public boolean hasMessage() {
		return update.hasMessage();
	}

	public MessageType getMessageType() {
		return update.getMessageType();
	}

	public Message getMessage() {
		return update.getMessage();
	}
}
