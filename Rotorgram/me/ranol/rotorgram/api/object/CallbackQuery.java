package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.MessageObject;
import me.ranol.rotorgram.api.abstraction.interfaces.SendableObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;

public class CallbackQuery extends TelegramObject implements OtherKeySet, StringIdObject, SendableObject, MessageObject {
	public CallbackQuery() {
		addKeys(ID_STRING, FROM, MESSAGE, INLINE_MESSAGE_ID, CHAT_INSTANCE, DATA_STRING, GAME_SHORT_NAME);
	}

	public String getInlineMessageId() {
		return get(INLINE_MESSAGE_ID);
	}

	public boolean hasInlineMessageId() {
		return contains(INLINE_MESSAGE_ID);
	}

	public String getChatInstace() {
		return get(CHAT_INSTANCE);
	}

	public boolean hasChatInstance() {
		return contains(CHAT_INSTANCE);
	}

	public String getData() {
		return get(DATA_STRING);
	}

	public boolean hasData() {
		return contains(DATA_STRING);
	}

	public String getGameShortName() {
		return get(GAME_SHORT_NAME);
	}

	public boolean hasGameShortName() {
		return contains(GAME_SHORT_NAME);
	}
}
