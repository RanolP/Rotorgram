package me.ranol.rotorgram.api.abstraction.keysets;

import me.ranol.rotorgram.api.abstraction.AttributeKey;
import me.ranol.rotorgram.api.object.PhotoSize;
import me.ranol.rotorgram.api.object.chat.Chat;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageEntity;
import me.ranol.rotorgram.api.object.users.User;

public interface MessageKeySet {
	AttributeKey<Long> MESSAGE_ID = new AttributeKey<>("message_id", Long.class);
	AttributeKey<Long> DATE = new AttributeKey<>("date", Long.class);
	AttributeKey<User> FORWARD_FROM = new AttributeKey<>("forward_from", User.class);
	AttributeKey<Chat> FORWARD_FROM_CHAT = new AttributeKey<>("forward_from_chat", Chat.class);
	AttributeKey<Long> FORWARD_FROM_ID = new AttributeKey<>("forward_from_message_id", Long.class);
	AttributeKey<Long> FORWARD_DATE = new AttributeKey<>("forward_date", Long.class);
	AttributeKey<Message> REPLY_TO = new AttributeKey<>("reply_to_message", Message.class);
	AttributeKey<Long> EDIT_DATE = new AttributeKey<>("edit_date", Long.class);
	AttributeKey<MessageEntity[]> ENTITIES = new AttributeKey<>("entities", MessageEntity[].class);
	AttributeKey<PhotoSize[]> PHOTO = new AttributeKey<>("photo", PhotoSize[].class);
	AttributeKey<User> NEW_MEMBER = new AttributeKey<>("new_chat_member", User.class);
	AttributeKey<User> LEFT_MEMBER = new AttributeKey<>("left_chat_member", User.class);
	AttributeKey<String> NEW_TITLE = new AttributeKey<>("new_chat_title", String.class);
	AttributeKey<PhotoSize[]> NEW_PHOTO = new AttributeKey<>("new_chat_photo", PhotoSize[].class);
	AttributeKey<Boolean> DELETE_CHAT_PHOTO = new AttributeKey<>("delete_chat_photo", Boolean.class);
	AttributeKey<Boolean> GROUP_CREATED = new AttributeKey<>("group_chat_created", Boolean.class);
	AttributeKey<Boolean> SUPERGROUP_CREATED = new AttributeKey<>("supergroup_chat_created", Boolean.class);
	AttributeKey<Boolean> CHANNEL_CREATED = new AttributeKey<>("channel_chat_created", Boolean.class);
	AttributeKey<Long> MIGRATE_TO_CHAT_ID = new AttributeKey<>("migrate_to_chat_id", Long.class);
	AttributeKey<Long> MIGRATE_FROM_CHAT_ID = new AttributeKey<>("migrate_from_chat_id", Long.class);
	AttributeKey<Message> PINNED_MESSAGE = new AttributeKey<>("pinned_message", Message.class);
}
