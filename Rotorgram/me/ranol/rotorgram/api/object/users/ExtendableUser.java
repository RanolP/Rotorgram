package me.ranol.rotorgram.api.object.users;

import me.ranol.rotorgram.api.object.Validatable;
import me.ranol.rotorgram.gson.GsonUser;
import me.ranol.rotorgram.utils.Util;

public class ExtendableUser<T extends GsonUser> extends Validatable<T> {

	public ExtendableUser(T user) {
		super(user);
	}

	public String getUsername() {
		return handle.username;
	}

	public long getId() {
		return Util.convert(handle.id);
	}

	public String getFirstName() {
		return handle.firstName;
	}

	public boolean hasLastName() {
		return getLastName() != null;
	}

	public String getLastName() {
		return handle.lastName;
	}

	public boolean hasUserName() {
		return getUsername() != null;
	}
}
