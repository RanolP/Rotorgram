package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;

public class QueryResultArticle<T extends QueryResultArticle, U extends InputMessageContent> extends QueryResult<QueryResultArticle, U> implements OtherKeySet {
	public QueryResultArticle(U content) {
		super(content);
		type("article");
		addKeys(TITLE, REPLY_MARKUP, URL, HIDE_URL, DESCRIPTION, THUMB_URL, THUMB_HEIGHT, THUMB_WIDTH);
	}

	@Override
	protected T self() {
		return (T) this;
	}

	public T title(String title) {
		set(TITLE, title);
		return self();
	}

	public T url(String url) {
		set(URL, url);
		return self();
	}

	public T hideUrl(boolean hideUrl) {
		set(HIDE_URL, hideUrl);
		return self();
	}

	public T description(String description) {
		set(DESCRIPTION, description);
		return self();
	}
}
