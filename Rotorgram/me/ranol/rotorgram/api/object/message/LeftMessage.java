package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.users.User;

public class LeftMessage extends Message {

	public User getLeftUser() {
		return get(LEFT_MEMBER);
	}
}
