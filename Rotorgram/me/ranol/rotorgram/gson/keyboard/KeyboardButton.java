package me.ranol.rotorgram.gson.keyboard;

import com.google.gson.annotations.SerializedName;

public class KeyboardButton {
	public final String text = null;
	@SerializedName("request_contact")
	public final Boolean requestContact = null;
	@SerializedName("request_location")
	public final Boolean requestLocation = null;

	@Override
	public String toString() {
		return "KeyboardButton{" +
				"text='" + text + '\'' +
				", requestContact=" + requestContact +
				", requestLocation=" + requestLocation +
				'}';
	}
}
