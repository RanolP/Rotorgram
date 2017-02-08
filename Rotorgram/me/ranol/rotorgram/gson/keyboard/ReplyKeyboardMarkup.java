package me.ranol.rotorgram.gson.keyboard;

import com.google.gson.annotations.SerializedName;

public class ReplyKeyboardMarkup {
	public final KeyboardButton[][] keyboard = null;
	@SerializedName("resize_keyboard")
	public final Boolean resizeKeyboard = null;
	@SerializedName("one_time_keyboard")
	public final Boolean oneTimeKeyboard = null;
	public final Boolean selective = null;
}
