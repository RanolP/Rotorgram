package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.gson.inline.GsonInlineQuery;

public class InlineQueryEvent extends CallableEvent {
	private final InlineQuery query;

	public InlineQueryEvent(GsonInlineQuery query) {
		this.query = new InlineQuery(query);
	}

	public InlineQuery getQuery() {
		return query;
	}

	public String getQueryText() {
		return query.getText();
	}

	public String getQueryId() {
		return query.getId();
	}
}
