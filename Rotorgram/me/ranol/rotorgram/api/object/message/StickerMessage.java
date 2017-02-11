package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.message.object.Sticker;

public class StickerMessage extends Message {

	public Sticker getSticker() {
		return get(STICKER);
	}

	public String getStickerId() {
		return getSticker().getId();
	}

	public boolean hasEmoji() {
		return getSticker().hasEmoji();
	}

	public String getEmoji() {
		return getSticker().getEmoji();
	}
}
