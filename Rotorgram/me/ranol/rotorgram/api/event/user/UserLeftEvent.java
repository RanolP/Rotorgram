package me.ranol.rotorgram.api.event.user;

import me.ranol.rotorgram.api.event.message.MessageEvent;
import me.ranol.rotorgram.api.object.message.JoinMessage;
import me.ranol.rotorgram.api.object.message.LeftMessage;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class UserLeftEvent extends MessageEvent<LeftMessage> {
	public UserLeftEvent(LeftMessage message) {
		super(message);
	}

	public User getLeftedUser() {
		return getMessage().getLeftUser();
	}
}
