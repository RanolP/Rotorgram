package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class JoinMessage extends Message {
	User join;

	public JoinMessage(GsonMessage message) {
		super(message);
		join = new User(message.newMember);
	}

	public User getJoinUser() {
		return join;
	}
}
