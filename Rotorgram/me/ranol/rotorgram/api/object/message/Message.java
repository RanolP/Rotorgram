package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.Initializable;
import me.ranol.rotorgram.api.abstraction.interfaces.LongIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.MessageKeySet;
import me.ranol.rotorgram.api.object.chat.Chat;
import me.ranol.rotorgram.api.object.users.User;

import java.util.function.Supplier;

public class Message extends TelegramObject implements LongIdObject, MessageKeySet, Initializable {

	private MessageType type;

	public Message() {
		addKeys(MESSAGE_ID, FROM, DATE, CHAT, FORWARD_FROM, FORWARD_FROM_CHAT, FORWARD_FROM_ID,
				FORWARD_DATE, REPLY_TO, EDIT_DATE, TEXT, ENTITIES, AUDIO, DOCUMENT, GAME, PHOTO, STICKER, VIDEO, VOICE,
				CAPTION, CONTACT, LOCATION, VENUE, NEW_MEMBER, LEFT_MEMBER, NEW_TITLE, NEW_PHOTO, DELETE_CHAT_PHOTO,
				GROUP_CREATED, SUPERGROUP_CREATED, CHANNEL_CREATED, MIGRATE_TO_CHAT_ID, MIGRATE_FROM_CHAT_ID,
				PINNED_MESSAGE);
	}

	@Override
	public void initialize() {
		type = parseType();
	}

	public long getId() {
		return getLong(MESSAGE_ID);
	}

	public User getFrom() {
		return get(FROM);
	}

	public boolean hasFrom() {
		return contains(FROM);
	}

	public MessageType getType() {
		return type;
	}

	public boolean hasChat() {
		return contains(CHAT);
	}

	public Chat getChat() {
		return get(CHAT);
	}

	public <T extends Message> T parseAs(Supplier<T> instance) {
		T result = mapping(instance.get(), this);
		result.initialize();
		return result;
	}

	public MessageType parseType() {
		if (getBoolean(CHANNEL_CREATED)) {
			return MessageType.CHANNEL_CREATE;
		} else if (getBoolean(GROUP_CREATED)) {
			return MessageType.GROUP_CREATE;
		} else if (getBoolean(SUPERGROUP_CREATED)) {
			return MessageType.SUPER_GROUP_CREATE;
		} else if (contains(NEW_MEMBER)) {
			return MessageType.JOIN_USER;
		} else if (contains(LEFT_MEMBER)) {
			return MessageType.LEFT_USER;
		} else if (contains(PINNED_MESSAGE)) {
			return MessageType.PINNING_MESSAGE;
		} else if (getBoolean(DELETE_CHAT_PHOTO)) {
			return MessageType.REMOVE_CHAT_PHOTO;
		} else if (contains(NEW_PHOTO)) {
			return MessageType.SET_CHAT_PHOTO;
		} else if (contains(AUDIO)) {
			return MessageType.AUDIO;
		} else if (contains(CONTACT)) {
			return MessageType.CONTACT;
		} else if (contains(DOCUMENT)) {
			return MessageType.DOCUMENT;
		} else if (contains(STICKER)) {
			return MessageType.STICKER;
		} else if (contains(TEXT)) {
			return MessageType.TEXT;
		} else if (contains(VENUE)) {
			return MessageType.VENUE;
		} else if (contains(VIDEO)) {
			return MessageType.VIDEO;
		} else if (contains(VOICE)) {
			return MessageType.VOICE;
		} else if (contains(PHOTO)) {
			return MessageType.IMAGE;
		}
		return MessageType.UNKNOWN;
	}
}
