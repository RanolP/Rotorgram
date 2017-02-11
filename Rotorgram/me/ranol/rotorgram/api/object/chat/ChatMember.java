package me.ranol.rotorgram.api.object.chat;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.users.User;

public class ChatMember extends TelegramObject implements OtherKeySet {
	public ChatMember() {
		addKeys(USER, STATUS);
	}

	public User getUser() {
		return get(USER);
	}

	public String getStatus() {
		return get(STATUS);
	}
}
