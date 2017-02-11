package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public interface LongIdObject extends Attributable {
	public default long getId() {
		return getLong(StandardKeySet.ID_LONG);
	}

	public default void setId(long id) {
		set(StandardKeySet.ID_LONG, id);
	}
}
