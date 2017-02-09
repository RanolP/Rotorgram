package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.api.object.Location;
import me.ranol.rotorgram.api.object.Validatable;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.inline.GsonChosenInlineResult;

public class ChosenInlineResult extends Validatable<GsonChosenInlineResult> {
	private User sender;
	private Location loc;

	public ChosenInlineResult(GsonChosenInlineResult handle) {
		super(handle);
		sender = new User(handle.fromUser);
		loc = new Location(handle.location);
	}

	public String getId() {
		return handle.id;
	}

	public User getSender() {
		return sender;
	}

	public Location getLocation() {
		return loc;
	}

	public boolean hasLocation() {
		return loc.isValid();
	}

	public String getInlineMessageId() {
		return handle.inlineMessageId;
	}

	public boolean hasInlineMessageId() {
		return getInlineMessageId() != null;
	}

	public String getQuery() {
		return handle.query;
	}
}
