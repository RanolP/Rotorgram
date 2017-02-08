package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class LeftMessage extends Message {
	User left;

	public LeftMessage(GsonMessage message) {
		super(message);
		left = new User(message.leftMember);
	}

	public User getLeftUser() {
		return left;
	}
}
