package me.ranol.rotorgram.gson.keyboard;

import com.google.gson.annotations.SerializedName;

public class ReplyKeyboardRemove {
	@SerializedName("remove_keyboard")
	public Boolean removeKeyboard = null;
	public Boolean selective = null;
}
