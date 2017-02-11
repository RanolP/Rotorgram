package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public interface Titleable extends Attributable {
	public default String getTitle() {
		return get(StandardKeySet.TITLE);
	}

	public default boolean hasTitle() {
		return contains(StandardKeySet.TITLE);
	}
}
