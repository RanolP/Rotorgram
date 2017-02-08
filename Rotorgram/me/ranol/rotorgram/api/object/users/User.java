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

	public Long getId() {
		return user.id;
	}

	public String getFirstName() {
		return user.firstName;
	}

	public boolean hasFirstName() {
		return getFirstName() != null;
	}

	public String getLastName() {
		return user.lastName;
	}
}
