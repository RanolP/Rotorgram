package me.ranol.rotorgram.gson.inline.result;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.GsonInlineKeyboardMarkup;
import me.ranol.rotorgram.gson.inline.GsonInlineQueryResult;

public class GsonInlineQueryResultGif extends GsonInlineQueryResult {
	@Required
	public String type = "gif";
	@Required
	@SerializedName("gif_url")
	public String url;
	@SerializedName("gif_width")
	public Long width;
	@SerializedName("gif_height")
	public Long height;
	@Required
	@SerializedName("thumb_url")
	public String thumbnailUrl;
	public String title;
	public String caption;
	@SerializedName("reply_markup")
	public GsonInlineKeyboardMarkup replyMarkup;
	
}