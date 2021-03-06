package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.object.message.StickerMessage;
import me.ranol.rotorgram.api.object.message.object.Sticker;

public class StickerMessageEvent extends MessageEvent<StickerMessage> {
	public StickerMessageEvent(StickerMessage message) {
		super(message);
	}

	public Sticker getSticker() {
		return getMessage().getSticker();
	}

	public String getStickerEmoji() {
		return getSticker().getEmoji();
	}

	public String getStickerId() {
		return getSticker().getId();
	}

	public boolean hasEmoji() {
		return getSticker().hasEmoji();
	}
}
