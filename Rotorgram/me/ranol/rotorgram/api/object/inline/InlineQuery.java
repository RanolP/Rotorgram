package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.LocationObject;
import me.ranol.rotorgram.api.abstraction.interfaces.SendableObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.abstraction.keysets.StandardKeySet;

public class InlineQuery extends TelegramObject implements StringIdObject, SendableObject, LocationObject, StandardKeySet, OtherKeySet {

	public InlineQuery() {
		addKeys(ID_STRING, FROM, LOCATION, QUERY, OFFSET_STRING);
	}

	public String getText() {
		return getString(QUERY);
	}

	public String getOffset() {
		return getString(OFFSET_STRING);
	}
}
