package me.ranol.rotorgram.api.abstraction.keysets;

import me.ranol.rotorgram.api.abstraction.AttributeKey;
import me.ranol.rotorgram.api.object.inline.InlineKeyboardMarkup;
import me.ranol.rotorgram.api.object.inline.input.InputMessageContent;
import me.ranol.rotorgram.api.object.users.User;

public interface OtherKeySet {
	AttributeKey<String> RESULT_ID = new AttributeKey<>("result_id", String.class);
	AttributeKey<String> INLINE_MESSAGE_ID = new AttributeKey<>("inline_message_id", String.class);
	AttributeKey<String> EMOJI = new AttributeKey<>("emoji", String.class);
	AttributeKey<User> USER = new AttributeKey<>("user", User.class);
	AttributeKey<String> ADDRESS = new AttributeKey<>("address", String.class);
	AttributeKey<String> FOURSQUARE_ID = new AttributeKey<>("foursquare_id", String.class);
	AttributeKey<Boolean> ALL_MEMBER_ADMIN = new AttributeKey<>("all_members_are_administrators",
																Boolean.class);
	AttributeKey<String> STATUS = new AttributeKey<>("status", String.class);
	AttributeKey<String> QUERY = new AttributeKey<>("query", String.class);
	AttributeKey<String> CHAT_INSTANCE = new AttributeKey<>("chat_instance", String.class);
	AttributeKey<String> GAME_SHORT_NAME = new AttributeKey<>("game_short_name", String.class);
	AttributeKey<String> FILE_ID = new AttributeKey<>("file_id", String.class);
	AttributeKey<Long> FILE_SIZE = new AttributeKey<>("file_size", Long.class);
	AttributeKey<String> FILE_PATH = new AttributeKey<>("file_path", String.class);

	AttributeKey<String> USERNAME = new AttributeKey<>("username", String.class);
	AttributeKey<String> FIRST_NAME = new AttributeKey<>("first_name", String.class);
	AttributeKey<String> LAST_NAME = new AttributeKey<>("last_name", String.class);

	AttributeKey<Float> LONGITUDE = new AttributeKey<>("longitude", Float.class);
	AttributeKey<Float> LATITUDE = new AttributeKey<>("latitude", Float.class);

	AttributeKey<InputMessageContent> INPUT_MESSAGE_CONTENT = new AttributeKey<>("input_message_content",
																				 InputMessageContent.class);
	AttributeKey<InlineKeyboardMarkup> REPLY_MARKUP = new AttributeKey<>("reply_markup", InlineKeyboardMarkup.class);
	AttributeKey<Boolean> HIDE_URL = new AttributeKey<>("hide_url", Boolean.class);
	AttributeKey<String> DESCRIPTION = new AttributeKey<>("description", String.class);
	AttributeKey<String> THUMB_URL = new AttributeKey<>("thumb_url", String.class);
	AttributeKey<Long> THUMB_WIDTH = new AttributeKey<>("thumb_width", Long.class);
	AttributeKey<Long> THUMB_HEIGHT = new AttributeKey<>("thumb_height", Long.class);

	AttributeKey<String> GIF_URL = new AttributeKey<>("gif_url", String.class);
	AttributeKey<Long> GIF_WIDTH = new AttributeKey<>("gif_width", Long.class);
	AttributeKey<Long> GIF_HEIGHT = new AttributeKey<>("gif_height", Long.class);

	AttributeKey<String> MPEG4_URL = new AttributeKey<>("mpeg4_url", String.class);
	AttributeKey<Long> MPEG4_WIDTH = new AttributeKey<>("mpeg4_width", Long.class);
	AttributeKey<Long> MPEG4_HEIGHT = new AttributeKey<>("mpeg4_height", Long.class);

	AttributeKey<String> PHOTO_URL = new AttributeKey<>("photo_url", String.class);
	AttributeKey<Long> PHOTO_WIDTH = new AttributeKey<>("photo_width", Long.class);
	AttributeKey<Long> PHOTO_HEIGHT = new AttributeKey<>("photo_height", Long.class);

	AttributeKey<String> MESSAGE_TEXT = new AttributeKey<>("message_text", String.class);
	AttributeKey<String> PARSE_MODE = new AttributeKey<>("parse_mode", String.class);
}
