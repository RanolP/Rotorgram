package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;

public class QueryResultGif extends QueryResult<QueryResultGif, InputMessageContent> implements OtherKeySet {

	public QueryResultGif(InputMessageContent content) {
		super(content);
		addKeys(GIF_HEIGHT, GIF_WIDTH, THUMB_URL, TITLE, CAPTION, REPLY_MARKUP, GIF_URL);
		type("gif");
	}

	@Override
	protected QueryResultGif self() {
		return this;
	}
}
