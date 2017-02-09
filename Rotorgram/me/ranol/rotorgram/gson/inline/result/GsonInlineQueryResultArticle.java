package me.ranol.rotorgram.gson.inline.result;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.GsonInlineKeyboardMarkup;
import me.ranol.rotorgram.gson.inline.GsonInlineQueryResult;

public class GsonInlineQueryResultArticle extends GsonInlineQueryResult {
	@Required
	public final String type = "article";
	@Required
	public String title;
	@SerializedName("reply_markup")
	public GsonInlineKeyboardMarkup replyMarkup;
	public String url;
	@SerializedName("hide_url")
	public Boolean hideUrl;
	public String description;
	@SerializedName("thumb_url")
	public String thumbnailUrl;
	@SerializedName("thumb_width")
	public Long thumbnailWidth;
	@SerializedName("thumb_height")
	public Long thumbnailHeight;
}
