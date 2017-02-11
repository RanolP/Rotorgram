package me.ranol.rotorgram.api.object;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.AttributeKey;
import me.ranol.rotorgram.api.abstraction.interfaces.MessageObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;
import me.ranol.rotorgram.api.object.inline.ChosenInlineResult;
import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;

import static me.ranol.rotorgram.api.object.Update.UpdateKeySet.*;

public class Update extends TelegramObject implements MessageObject, OtherKeySet {

	static class UpdateKeySet {
		static final AttributeKey<Long> ID = new AttributeKey<>("update_id", Long.class);
		static final AttributeKey<InlineQuery> INLINE_QUERY = new AttributeKey<>("inline_query", InlineQuery.class);
		static final AttributeKey<ChosenInlineResult> CHOSEN_INLINE_RESULT = new AttributeKey<>("chosen_inline_result",
																								ChosenInlineResult.class);
		static final AttributeKey<Message> EDITED_MESSAGE = new AttributeKey<>("edited_message", Message.class);
		static final AttributeKey<Message> CHANNEL_POST = new AttributeKey<>("edited_message", Message.class);
		static final AttributeKey<Message> EDITED_CHANNEL_POST = new AttributeKey<>("edited_message", Message.class);
		static final AttributeKey<CallbackQuery> CALLBACK_QUERY = new AttributeKey<>("edited_message",
																					 CallbackQuery.class);
	}

	public Update() {
		addKeys(ID, INLINE_QUERY, CHOSEN_INLINE_RESULT, MESSAGE, EDITED_MESSAGE);
	}

	public Message getMessage() {
		return get(MESSAGE);
	}

	public long getId() {
		return getLong(ID);
	}

	public boolean hasMessage() {
		return getMessage() != null;
	}

	public boolean hasInlineQuery() {
		return getInlineQuery() != null;
	}

	public InlineQuery getInlineQuery() {
		return get(INLINE_QUERY);
	}

	public ChosenInlineResult getChosenInlineResult() {
		return get(CHOSEN_INLINE_RESULT);
	}

	public boolean hasChosenInlineResult() {
		return getChosenInlineResult() != null;
	}

	public MessageType getMessageType() {
		return getMessage().getType();
	}
}
