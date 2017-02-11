package me.ranol.rotorgram.api.event.user;

import me.ranol.rotorgram.api.event.message.MessageEvent;
import me.ranol.rotorgram.api.object.message.JoinMessage;
import me.ranol.rotorgram.api.object.users.User;

public class UserJoinEvent extends MessageEvent<JoinMessage> {
	public UserJoinEvent(JoinMessage message) {
		super(message);
	}

	public User getJoinedUser() {
		return getMessage().getJoinUser();
	}
}
