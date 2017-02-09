package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.api.object.users.ExtendableUser;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.GsonChat;
import me.ranol.rotorgram.utils.Util;

public class Chat extends ExtendableUser<GsonChat> {
	private ChatType type;

	public Chat(GsonChat chat) {
		super(chat);
		type = ChatType.byName(handle.type);
	}


	public boolean hasTitle() {
		return getTitle() != null;
	}

	public String getTitle() {
		return handle.title;
	}

	public boolean isAllMembersAdmin() {
		return Util.convert(handle.allMemberAdmin);
	}

	public ChatType getType() {
		return type;
	}

}