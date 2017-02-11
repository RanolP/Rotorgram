package me.ranol.rotorgram.api.object.chat;

import me.ranol.rotorgram.api.abstraction.interfaces.Titleable;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.users.User;

public class Chat extends User implements OtherKeySet, Titleable {
	private ChatType type;

	public Chat() {
		addKeys(TYPE, TITLE, ALL_MEMBER_ADMIN);
		type = ChatType.byName(get(TYPE));
	}

	public boolean isAllMembersAdmin() {
		return getBoolean(ALL_MEMBER_ADMIN);
	}

	public ChatType getType() {
		return type;
	}

}