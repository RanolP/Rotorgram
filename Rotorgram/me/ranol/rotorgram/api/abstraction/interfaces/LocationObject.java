package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;
import me.ranol.rotorgram.api.object.Location;

public interface LocationObject extends Attributable {
	public default Location getLocation() {
		return get(StandardKeySet.LOCATION);
	}

	public default boolean hasLocation() {
		return contains(StandardKeySet.LOCATION);
	}
}
