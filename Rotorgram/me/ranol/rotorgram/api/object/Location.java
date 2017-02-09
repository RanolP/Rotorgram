package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.gson.GsonLocation;

public class Location extends Validatable<GsonLocation> {
	public Location(GsonLocation handle) {
		super(handle);
	}

	public float getLatitude() {
		return handle.latitude;
	}

	public float getLongitude() {
		return handle.longitude;
	}
}
