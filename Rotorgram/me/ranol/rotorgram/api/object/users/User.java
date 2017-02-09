package me.ranol.rotorgram.api.object.users;

import me.ranol.rotorgram.api.object.Validatable;
import me.ranol.rotorgram.gson.GsonUser;

public class User extends ExtendableUser<GsonUser> {

	public User(GsonUser user) {
		super(user);
	}
}
