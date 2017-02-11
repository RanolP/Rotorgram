package me.ranol.rotorgram.api.abstraction.keysets;

import me.ranol.rotorgram.api.abstraction.AttributeKey;
import me.ranol.rotorgram.api.object.Location;
import me.ranol.rotorgram.api.object.PhotoSize;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.users.User;

public interface StandardKeySet {
	AttributeKey<Long> ID_LONG = new AttributeKey<>("id", Long.class);
	AttributeKey<String> ID_STRING = new AttributeKey<>("id", String.class);
	AttributeKey<String> OFFSET_STRING = new AttributeKey<>("offset", String.class);
	AttributeKey<Long> OFFSET_LONG = new AttributeKey<>("offset", Long.class);
	AttributeKey<Long> LENGTH = new AttributeKey<>("length", Long.class);
	AttributeKey<String> TYPE = new AttributeKey<>("type", String.class);
	AttributeKey<String> URL = new AttributeKey<>("url", String.class);
	AttributeKey<Long> WIDTH = new AttributeKey<>("width", Long.class);
	AttributeKey<Long> HEIGHT = new AttributeKey<>("height", Long.class);
	AttributeKey<PhotoSize> THUMB = new AttributeKey<>("thumb", PhotoSize.class);
	AttributeKey<Message> MESSAGE = new AttributeKey<>("message", Message.class);
	AttributeKey<User> FROM = new AttributeKey<>("from", User.class);
	AttributeKey<Location> LOCATION = new AttributeKey<>("location", Location.class);
	AttributeKey<String> TITLE = new AttributeKey<>("title", String.class);
	AttributeKey<String> DATA_STRING = new AttributeKey<>("data", String.class);
}
