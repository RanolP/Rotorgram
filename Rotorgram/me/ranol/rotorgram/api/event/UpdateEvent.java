package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.Update;
import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;
import me.ranol.rotorgram.gson.GsonUpdate;
import me.ranol.rotorgram.gson.message.GsonMessage;

import java.util.function.Function;

public class UpdateEvent extends CallableEvent {
	private final Update update;

	public UpdateEvent(GsonUpdate update) {
		this.update = new Update(update);
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

	public <T extends Message> T getMessage(Function<GsonMessage, T> func) {
		return update.getMessage(func);
	}
}
