package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.message.GsonMessage;

public class GsonCallbackQuery {
	public final String id = null;
	@SerializedName("from")
	public final GsonUser fromUser = null;
	public final GsonMessage message = null;
	@SerializedName("inline_message_id")
	public final String inlineMessageId = null;
	@SerializedName("chat_instance")
	public final String chatInstance = null;
	public final String data = null;
	@SerializedName("game_short_name")
	public final String gameShortName = null;
}
