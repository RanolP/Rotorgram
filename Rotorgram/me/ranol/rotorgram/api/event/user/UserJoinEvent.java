package me.ranol.rotorgram.api.event.user;

import me.ranol.rotorgram.api.event.message.MessageEvent;
import me.ranol.rotorgram.api.object.message.JoinMessage;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class UserJoinEvent extends MessageEvent<JoinMessage> {
	public UserJoinEvent(GsonMessage message) {
		super(message);
	}

	@Override
	public JoinMessage convert(GsonMessage msg) {
		return new JoinMessage(msg);
	}

	public User getJoinedUser() {
		return getMessage().getJoinUser();
	}
}
