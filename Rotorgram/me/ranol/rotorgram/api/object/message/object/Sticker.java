package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.api.abstraction.interfaces.SizableObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;
import me.ranol.rotorgram.api.abstraction.interfaces.ThumbnailObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;

public class Sticker extends TFile implements StringIdObject, OtherKeySet, SizableObject, ThumbnailObject {
	public Sticker() {
		addKeys(WIDTH, HEIGHT, THUMB, ID_STRING, EMOJI);
	}

	public String getEmoji() {
		return get(EMOJI);
	}

	public boolean hasEmoji() {
		return contains(EMOJI);
	}

	public void send(Long chatId) {

	}
}
