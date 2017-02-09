package me.ranol.rotorgram.gson.inline.result;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.GsonInlineKeyboardMarkup;
import me.ranol.rotorgram.gson.inline.GsonInlineQueryResult;

public class GsonInlineQueryResultPhoto extends GsonInlineQueryResult {
	@Required
	public final String type = "photo";
	@Required
	@SerializedName("photo_url")
	public String url;
	@Required
	@SerializedName("thumb_url")
	public String thumbnailUrl;
	@SerializedName("photo_width")
	public Long width;
	@SerializedName("photo_height")
	public Long height;
	public String title;
	public String description;
	public String caption;
	@SerializedName("reply_markup")
	public GsonInlineKeyboardMarkup replyMarkup;
}
