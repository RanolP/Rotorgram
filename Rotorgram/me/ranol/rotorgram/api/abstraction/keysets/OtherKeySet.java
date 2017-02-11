package me.ranol.rotorgram.api.abstraction.keysets;

import me.ranol.rotorgram.api.abstraction.AttributeKey;
import me.ranol.rotorgram.api.object.users.User;

public interface OtherKeySet {
	AttributeKey<String> RESULT_ID = new AttributeKey<>("result_id", String.class);
	AttributeKey<String> INLINE_MESSAGE_ID = new AttributeKey<>("inline_message_id", String.class);
	AttributeKey<String> EMOJI = new AttributeKey<>("emoji", String.class);
	AttributeKey<User> USER = new AttributeKey<>("user", User.class);
	AttributeKey<String> ADDRESS = new AttributeKey<>("address", String.class);
	AttributeKey<String> FOURSQUARE_ID = new AttributeKey<>("foursquare_id", String.class);
	static final AttributeKey<Boolean> ALL_MEMBER_ADMIN = new AttributeKey<>("all_members_are_administrators",
																			 Boolean.class);
	AttributeKey<String> STATUS = new AttributeKey<>("status", String.class);
	AttributeKey<String> QUERY = new AttributeKey<>("query", String.class);
	AttributeKey<String> CHAT_INSTANCE = new AttributeKey<>("chat_instance", String.class);
	AttributeKey<String> GAME_SHORT_NAME = new AttributeKey<>("game_short_name", String.class);
	static final AttributeKey<String> FILE_ID = new AttributeKey<>("file_id", String.class);
	static final AttributeKey<Long> FILE_SIZE = new AttributeKey<>("file_size", Long.class);
	static final AttributeKey<String> FILE_PATH = new AttributeKey<>("file_path", String.class);

	static final AttributeKey<String> USERNAME = new AttributeKey<>("username", String.class);
	static final AttributeKey<String> FIRST_NAME = new AttributeKey<>("first_name", String.class);
	static final AttributeKey<String> LAST_NAME = new AttributeKey<>("last_name", String.class);

	static final AttributeKey<Float> LONGITUDE = new AttributeKey<>("longitude", Float.class);
	static final AttributeKey<Float> LATITUDE = new AttributeKey<>("latitude", Float.class);
}
