package me.ranol.rotorgram.api.object.inline.input;

import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;

public class InputTextMessageContent extends InputMessageContent implements OtherKeySet {
	public InputTextMessageContent() {
		addKeys(MESSAGE_TEXT, PARSE_MODE);
	}

	public InputTextMessageContent text(String text) {
		set(MESSAGE_TEXT, text);
		return this;
	}

	public InputMessageContent parseMode(String mode) {
		set(PARSE_MODE, mode);
		return this;
	}
}
