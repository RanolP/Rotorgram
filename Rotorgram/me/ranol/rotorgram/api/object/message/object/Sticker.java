package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.gson.message.GsonSticker;

public class Sticker {
	private GsonSticker handle;

	public Sticker(GsonSticker sticker) {
		handle = sticker;
		initialize();
	}

	private void initialize() {
	}

	public String getEmoji() {
		return handle.emoji;
	}

	public boolean hasEmoji() {
		return getEmoji() != null;
	}

	public String getId() {
		return handle.id;
	}
}
