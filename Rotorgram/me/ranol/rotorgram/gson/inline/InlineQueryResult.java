package me.ranol.rotorgram.gson.inline;

import com.google.gson.annotations.SerializedName;
import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.content.InputMessageContent;

public class InlineQueryResult {
	@Required
	public String id;
	@SerializedName("input_message_content")
	@Required
	public InputMessageContent inputMessageContent;
}
