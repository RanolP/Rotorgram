package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.gson.inline.GsonInlineQueryResult;
import me.ranol.rotorgram.gson.inline.content.GsonInputMessageContent;

import java.util.UUID;

public class QueryResult<T extends GsonInlineQueryResult, U extends GsonInputMessageContent> {
	protected T handle;
	protected U content;

	public QueryResult(T object, U content) {
		this.handle = object;
		this.content = content;
		handle.inputMessageContent = content;
	}

	public T get(String id) {
		setId(id);
		return handle;
	}

	public T get() {
		return get(UUID.randomUUID().toString());
	}

	public void setId(String id) {
		handle.id = id;
	}
}
