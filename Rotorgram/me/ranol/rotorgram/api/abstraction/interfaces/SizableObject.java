package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public interface SizableObject extends Attributable {
	public default long getWidth() {
		return get(StandardKeySet.WIDTH);
	}

	public default long getHeight() {
		return get(StandardKeySet.HEIGHT);
	}
}
