package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;

public class Location extends TelegramObject implements OtherKeySet {

	public Location() {
		addKeys(LONGITUDE, LATITUDE);
	}

	public float getLatitude() {
		return getFloat(LATITUDE);
	}

	public float getLongitude() {
		return getFloat(LATITUDE);
	}
}
