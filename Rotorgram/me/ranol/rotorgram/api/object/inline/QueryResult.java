package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.api.object.Argument;
import me.ranol.rotorgram.gson.inline.InlineQueryResult;
import me.ranol.rotorgram.gson.inline.content.InputMessageContent;

public class QueryResult<T extends InlineQueryResult, U extends InputMessageContent> {
	protected T handle;
	protected U content;

	public QueryResult(T object, U content){
		this.handle = object;
		this.content = content;
		handle.inputMessageContent = content;
	}

	public T get(String id) {
		setId(id);
		return handle;
	}

	public void setId(String id) {
		handle.id = id;
	}
}
