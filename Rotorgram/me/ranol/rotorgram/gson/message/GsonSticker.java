package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonPhotoSize;

public class GsonSticker extends GsonFile {
	public final Long width = null;
	public final Long height = null;
	@SerializedName("thumb")
	public final GsonPhotoSize thumbnail = null;
	public final String emoji = null;
}
