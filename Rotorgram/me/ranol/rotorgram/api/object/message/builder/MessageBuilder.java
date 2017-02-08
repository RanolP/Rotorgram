package me.ranol.rotorgram.api.object.message.builder;

import com.google.gson.JsonElement;

public abstract class MessageBuilder<T extends MessageBuilder> {
	protected String id;
	protected Boolean disableNotification;
	protected Long replyToMessageId;
	protected T ret;

	public T id(String id) {
		this.id = id;
		return ret;
	}

	public T id(long id) {
		this.id = Long.toString(id);
		return ret;
	}


	public T notify(boolean enable) {
		this.disableNotification = !enable;
		return ret;
	}

	public T reply(Long to) {
		this.replyToMessageId = to;
		return ret;
	}

	public abstract JsonElement send();
}
