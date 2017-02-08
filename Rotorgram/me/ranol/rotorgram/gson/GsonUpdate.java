package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.inline.ChosenInlineResult;
import me.ranol.rotorgram.gson.inline.InlineQuery;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class GsonUpdate {
	@SerializedName("update_id")
	public final Long id = null;
	@SerializedName("message")
	public final GsonMessage incomingMessage = null;
	@SerializedName("edited_message")
	public final GsonMessage editedMessage = null;
	@SerializedName("channel_post")
	public final GsonMessage channelPost = null;
	@SerializedName("edited_channel_post")
	public final GsonMessage editedChannelPost = null;
	@SerializedName("inline_query")
	public final InlineQuery inlineQuery = null;
	@SerializedName("chosen_inline_result")
	public final ChosenInlineResult chosenInlineResult = null;
	@SerializedName("callback_query")
	public final GsonCallbackQuery callbackQuery = null;
}
