package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;

import java.util.UUID;

public class QueryResult<T extends QueryResult, U extends InputMessageContent> extends TelegramObject implements StringIdObject, OtherKeySet {

	public QueryResult(U content) {
		addKeys(TYPE, ID_STRING, INPUT_MESSAGE_CONTENT);
		content(content);
	}

	protected T self() {
		return (T) this;
	}

	public T type(String type) {
		set(TYPE, type);
		return self();
	}

	public T id(String id) {
		setId(id);
		return self();
	}

	public U getContent() {
		return (U) get(INPUT_MESSAGE_CONTENT);
	}

	public T content(U content) {
		set(INPUT_MESSAGE_CONTENT, content);
		return self();
	}

	public void makeId() {
		id(UUID.randomUUID().toString());
	}
}
