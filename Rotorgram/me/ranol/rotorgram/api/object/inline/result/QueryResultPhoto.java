package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;

public class QueryResultPhoto extends QueryResult<QueryResultPhoto, InputMessageContent> {

	public QueryResultPhoto(InputMessageContent content) {
		super(content);
		type("photo");
		addKeys(PHOTO_URL, THUMB_URL, PHOTO_WIDTH, PHOTO_HEIGHT, TITLE, DESCRIPTION, CAPTION, REPLY_MARKUP);
	}

	@Override
	protected QueryResultPhoto self() {
		return this;
	}
}
