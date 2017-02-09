package me.ranol.rotorgram.api.object.inline;

import me.ranol.rotorgram.gson.inline.content.GsonInputTextMessageContent;
import me.ranol.rotorgram.gson.inline.result.GsonInlineQueryResultArticle;

public class TextQueryResult extends QueryResult<GsonInlineQueryResultArticle, GsonInputTextMessageContent> {
	{
		content.parseMode = "";
	}

	public TextQueryResult() {
		super(new GsonInlineQueryResultArticle(), new GsonInputTextMessageContent());
	}

	public TextQueryResult setVisibleString(String val) {
		handle.title = val;
		return this;
	}

	public TextQueryResult setString(String val) {
		content.text = val;
		return this;
	}

	public TextQueryResult setParseMode(String val) {
		content.parseMode = val;
		return this;
	}

	public TextQueryResult setUrl(String val) {
		handle.url = val;
		return this;
	}

	public TextQueryResult setHideUrl(boolean val) {
		handle.hideUrl = val;
		return this;
	}

	public TextQueryResult setDescription(String val) {
		handle.description = val;
		return this;
	}
}
