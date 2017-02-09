package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.api.object.Validatable;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.inline.GsonInlineQuery;

public class InlineQuery extends Validatable<GsonInlineQuery> {
	private User from;

	public InlineQuery(GsonInlineQuery handle) {
		super(handle);
		from = new User(handle.fromUser);
	}

	public String getText() {
		return handle.query;
	}

	public String getId() {
		return handle.id;
	}

	public User getSender() {
		return from;
	}

	public boolean hasSender() {
		return from.isValid();
	}
}
