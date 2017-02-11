package me.ranol.rotorgram.api.object.users;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.LongIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public class User extends TelegramObject implements LongIdObject, OtherKeySet {

	public User() {
		addKeys(StandardKeySet.ID_LONG, USERNAME, FIRST_NAME, LAST_NAME);
	}

	public String getUsername() {
		return getString(USERNAME);
	}

	public String getFirstName() {
		return getString(FIRST_NAME);
	}

	public boolean hasLastName() {
		return getLastName() != null;
	}

	public String getLastName() {
		return get(LAST_NAME);
	}

	public boolean hasUserName() {
		return getUsername() != null;
	}
}
