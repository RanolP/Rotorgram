package me.ranol.rotorgram.gson.inline.content;

import com.google.gson.annotations.SerializedName;

public class GsonInputTextMessageContent extends GsonInputMessageContent {
	@SerializedName("message_text")
	public String text;
	@SerializedName("parse_mode")
	public String parseMode;
}
