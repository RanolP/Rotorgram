package me.ranol.rotorgram.gson.inline.result;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.InlineKeyboardMarkup;
import me.ranol.rotorgram.gson.inline.InlineQueryResult;
import me.ranol.rotorgram.gson.inline.content.InputMessageContent;

public class InlineQueryResultArticle extends InlineQueryResult{
	@Required
	public final String type = "article";
	@Required
	public String title;
	@SerializedName("reply_markup")
	public InlineKeyboardMarkup replyMarkup;
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
