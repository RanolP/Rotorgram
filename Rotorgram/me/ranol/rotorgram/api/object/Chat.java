package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.gson.GsonChat;

public class Chat {
	private GsonChat chat;

	public Chat(GsonChat chat) {
		this.chat = chat;
		initialize();
	}

	private void initialize() {

	}

	public boolean hasTitle() {
		return getTitle() != null;
	}

	public String getTitle() {
		return chat.title;
	}
}
