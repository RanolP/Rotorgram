package me.ranol.rotorgram.api.object.message;

import me.ranol.rotorgram.api.object.Chat;
import me.ranol.rotorgram.api.object.Validatable;
import me.ranol.rotorgram.api.object.users.User;
import me.ranol.rotorgram.gson.message.GsonMessage;
import me.ranol.rotorgram.utils.Util;

import java.util.Objects;

public class Message extends Validatable<GsonMessage> {
	private User from;
	private Chat chat;
	private MessageType type;

	public Message(GsonMessage message) {
		super(message);
		initialize();
	}

	private void initialize() {
		from = new User(handle.fromUser);
		chat = new Chat(handle.chat);
		type = parseType(handle);
	}

	public long getId() {
		return handle.id;
	}

	public User getFrom() {
		return from;
	}

	public boolean hasFrom() {
		return getFrom() != null;
	}

	public MessageType getType() {
		return type;
	}

	public boolean hasChat() {
		return getChat() != null;
	}

	public Chat getChat() {
		return chat;
	}

	public static MessageType parseType(GsonMessage message) {
		if (Util.convert(message.channelCreated)) {
			return MessageType.CHANNEL_CREATE;
		} else if (Util.convert(message.groupCreated)) {
			return MessageType.GROUP_CREATE;
		} else if (Util.convert(message.superGroupCreated)) {
			return MessageType.SUPER_GROUP_CREATE;
		} else if (message.newMember != null) {
			return MessageType.JOIN_USER;
		} else if (message.leftMember != null) {
			return MessageType.LEFT_USER;
		} else if (message.pinnedMessage != null) {
			return MessageType.PINNING_MESSAGE;
		} else if (Util.convert(message.deleteChatPhoto)) {
			return MessageType.REMOVE_CHAT_PHOTO;
		} else if (message.newPhoto != null) {
			return MessageType.SET_CHAT_PHOTO;
		} else if (message.audio != null) {
			return MessageType.AUDIO;
		} else if (message.contact != null) {
			return MessageType.CONTACT;
		} else if (message.document != null) {
			return MessageType.DOCUMENT;
		} else if (message.sticker != null) {
			return MessageType.STICKER;
		} else if (message.text != null) {
			return MessageType.TEXT;
		} else if (message.venue != null) {
			return MessageType.VENUE;
		} else if (message.video != null) {
			return MessageType.VIDEO;
		} else if (message.voice != null) {
			return MessageType.VOICE;
		} else if (message.photo != null) {
			return MessageType.IMAGE;
		}
		return MessageType.UNKNOWN;
	}

	@Override
	public String toString() {
		return "Message {" +
				", from=" + from +
				", chat=" + chat +
				", type=" + type +
				'}';
	}
}
