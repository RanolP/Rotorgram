package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.gson.message.GsonSticker;

public class Sticker extends TFile<GsonSticker> {
	public Sticker(GsonSticker file) {
		super(file);
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

	public void send(Long chatId){

	}
}
