package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;
import me.ranol.rotorgram.api.object.users.User;

public interface SendableObject extends Attributable {
	public default User getSender() {
		return get(StandardKeySet.FROM);
	}

	public default boolean hasSender() {
		return contains(StandardKeySet.FROM);
	}
}
