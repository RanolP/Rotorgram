package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public interface StringIdObject extends Attributable {
	public default String getId() {
		return getString(StandardKeySet.ID_STRING);
	}

	public default void setId(String id) {
		set(StandardKeySet.ID_STRING, id);
	}
}
