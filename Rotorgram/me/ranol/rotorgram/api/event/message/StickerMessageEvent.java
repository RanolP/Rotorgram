package me.ranol.rotorgram.api.event.message;

import me.ranol.rotorgram.api.object.message.StickerMessage;
import me.ranol.rotorgram.api.object.message.object.Sticker;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class StickerMessageEvent extends MessageEvent<StickerMessage> {
	public StickerMessageEvent(GsonMessage message) {
		super(message);
	}

	@Override
	public StickerMessage convert(GsonMessage msg) {
		return new StickerMessage(msg);
	}

	public Sticker getSticker() {
		return getMessage().getSticker();
	}
}
