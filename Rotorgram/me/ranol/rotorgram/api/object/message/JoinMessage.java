package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.users.User;

public class JoinMessage extends Message {

	public User getJoinUser() {
		return get(NEW_MEMBER);
	}
}
