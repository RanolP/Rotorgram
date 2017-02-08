package me.ranol.rotorgram.gson.inline.result;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.gson.inline.InlineKeyboardMarkup;
import me.ranol.rotorgram.gson.inline.InlineQueryResult;
import me.ranol.rotorgram.gson.inline.content.InputMessageContent;

public class InlineQueryResultMpeg4Gif extends InlineQueryResult {
	@Required
	public final String type = "mpeg4_gif";
	@Required
	@SerializedName("mpeg4_url")
	public String mpeg4Url;
	@SerializedName("mpeg4_width")
	public String width;
	@SerializedName("mpeg4_height")
	public String height;
	@SerializedName("thumb_url")
	@Required
	public String thumbnailUrl;
	public String title;
	public String caption;
	@SerializedName("reply_markup")
	public InlineKeyboardMarkup replyMarkup;
}
