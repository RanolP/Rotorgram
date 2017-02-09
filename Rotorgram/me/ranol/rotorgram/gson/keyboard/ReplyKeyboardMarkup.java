package me.ranol.rotorgram.gson.keyboard;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class ReplyKeyboardMarkup {
	public final KeyboardButton[][] keyboard = null;
	@SerializedName("resize_keyboard")
	public final Boolean resizeKeyboard = null;
	@SerializedName("one_time_keyboard")
	public final Boolean oneTimeKeyboard = null;
	public final Boolean selective = null;

	@Override
	public String toString() {
		return "ReplyKeyboardMarkup{" +
				"keyboard=" + Arrays.toString(keyboard) +
				", resizeKeyboard=" + resizeKeyboard +
				", oneTimeKeyboard=" + oneTimeKeyboard +
				", selective=" + selective +
				'}';
	}
}
