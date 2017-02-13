package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;

public class QueryResultMpeg4Gif extends QueryResult<QueryResultMpeg4Gif, InputMessageContent> implements OtherKeySet {

	public QueryResultMpeg4Gif(InputMessageContent content) {
		super(content);
		type("mpeg4_gif");
		addKeys(MPEG4_URL, MPEG4_WIDTH, MPEG4_HEIGHT, THUMB_URL, TITLE, CAPTION, REPLY_MARKUP);
	}

	@Override
	protected QueryResultMpeg4Gif self() {
		return this;
	}
}
