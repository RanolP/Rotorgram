package me.ranol.rotorgram.gson.inline;

import com.google.gson.annotations.SerializedName;
import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.content.GsonInputMessageContent;

public class GsonInlineQueryResult {
	@Required
	public String id;
	@SerializedName("input_message_content")
	@Required
	public GsonInputMessageContent inputMessageContent;
}
