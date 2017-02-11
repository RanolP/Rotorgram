package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.abstraction.interfaces.LocationObject;
import me.ranol.rotorgram.api.abstraction.interfaces.SendableObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;

public class ChosenInlineResult extends TelegramObject implements StringIdObject, SendableObject, LocationObject, OtherKeySet {
	static class ChosenInlineResultKeySet {
	}

	public ChosenInlineResult() {
		addKeys(RESULT_ID, FROM, LOCATION, INLINE_MESSAGE_ID, QUERY);
	}

	public String getId() {
		return getString(RESULT_ID);
	}

	public String getInlineMessageId() {
		return get(INLINE_MESSAGE_ID);
	}

	public boolean hasInlineMessageId() {
		return contains(INLINE_MESSAGE_ID);
	}

	public String getQuery() {
		return get(QUERY);
	}
}
