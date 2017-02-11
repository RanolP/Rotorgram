package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.users.User;

public class MessageEntity extends TelegramObject implements OtherKeySet {
	public MessageEntity() {
		addKeys(TYPE, OFFSET_LONG, LENGTH, URL, USER);
	}

	public String getType() {
		return get(TYPE);
	}

	public long getOffset() {
		return getLong(OFFSET_LONG);
	}

	public long getLength() {
		return getLong(LENGTH);
	}

	public String getUrl() {
		return get(URL);
	}

	public User getUser() {
		return get(USER);
	}
}
