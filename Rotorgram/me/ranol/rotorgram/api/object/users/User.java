package me.ranol.rotorgram.api.object.users;

import me.ranol.rotorgram.gson.GsonUser;

public class User {
	private GsonUser user;

	public User(GsonUser user) {
		this.user = user;
	}

	public String getUsername() {
		return user.username;
	}
}
