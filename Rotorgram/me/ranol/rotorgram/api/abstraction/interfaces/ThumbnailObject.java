package me.ranol.rotorgram.api.abstraction.interfaces;

import me.ranol.rotorgram.api.abstraction.Attributable;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;
import me.ranol.rotorgram.api.object.PhotoSize;

public interface ThumbnailObject extends Attributable {
	public default PhotoSize getThumbnail() {
		return get(StandardKeySet.THUMB);
	}
}
