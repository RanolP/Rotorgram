package me.ranol.rotorgram.api.object.inline.result;

import me.ranol.rotorgram.api.object.inline.input.InputTextMessageContent;

public class TextQueryResult extends QueryResultArticle<TextQueryResult, InputTextMessageContent> {
	{
		parseMode("");
	}

	public TextQueryResult() {
		super(new InputTextMessageContent());
	}

	public TextQueryResult text(String val) {
		getContent().text(val);
		return self();
	}

	public TextQueryResult parseMode(String val) {
		getContent().parseMode(val);
		return self();
	}

	@Override
	protected TextQueryResult self() {
		return this;
	}
}
