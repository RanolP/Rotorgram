package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.message.object.Sticker;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class StickerMessage extends Message {
	private Sticker sticker;

	public StickerMessage(GsonMessage message) {
		super(message);
		initialize();
	}

	public void initialize() {
		sticker = new Sticker(message.sticker);
	}

	public Sticker getSticker() {
		return sticker;
	}

	public String getStickerId() {
		return sticker.getId();
	}

	public boolean hasEmoji() {
		return sticker.hasEmoji();
	}

	public String getEmoji() {
		return sticker.getEmoji();
	}
}
