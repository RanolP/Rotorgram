package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.inline.InlineQuery;

public class InlineQueryEvent extends CallableEvent {
	private final InlineQuery query;

	public InlineQueryEvent(InlineQuery query) {
		this.query = query;
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
