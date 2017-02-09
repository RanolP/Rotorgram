package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.gson.message.GsonMessage;

public class CaptionedMessage extends Message {
	public CaptionedMessage(GsonMessage message) {
		super(message);
	}

	public String getCaption() {
		return handle.caption;
	}

	public boolean hasCaption() {
		return getCaption() != null;
	}
}
