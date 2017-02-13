package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.api.object.inline.result.QueryResult;

public class InlineQueryEvent extends CallableEvent {
	private final InlineQuery query;
	private QueryResult[] results = new QueryResult[0];

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

	public void setResults(QueryResult... results) {
		this.results = results;
	}
}
