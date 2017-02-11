package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;
import me.ranol.rotorgram.api.object.message.Message;

public interface MessageObject extends Attributable {
	public default Message getMessage() {
		return get(StandardKeySet.MESSAGE);
	}

	public default boolean hasMessage() {
		return contains(StandardKeySet.MESSAGE);
	}
}
