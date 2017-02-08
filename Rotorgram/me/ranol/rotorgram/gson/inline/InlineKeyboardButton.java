package me.ranol.rotorgram.gson.inline;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonCallbackGame;

public class InlineKeyboardButton {
	public final String text = null;
	public final String url = null;
	@SerializedName("callback_data")
	public final String callbackData = null;
	@SerializedName("switch_inline_query")
	public final String switchInlineQuery = null;
	@SerializedName("switch_inline_query_current_chat")
	public final String switchInlineQueryCurrentChat = null;
	@SerializedName("callback_game")
	public final GsonCallbackGame callbackGame = null;
}
