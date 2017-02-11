package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.LocationObject;
import me.ranol.rotorgram.api.abstraction.interfaces.Titleable;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.Location;

public class Venue extends TelegramObject implements OtherKeySet, LocationObject, Titleable {
	public Venue() {
		addKeys(LOCATION, TITLE, ADDRESS, FOURSQUARE_ID);
	}

	public String getAddress() {
		return get(ADDRESS);
	}

	public boolean hasAddress() {
		return contains(ADDRESS);
	}

	public String getFourSquareId() {
		return get(FOURSQUARE_ID);
	}

	public boolean hasFourSquareId() {
		return contains(FOURSQUARE_ID);
	}
}
