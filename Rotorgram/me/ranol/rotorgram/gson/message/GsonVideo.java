package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonPhotoSize;

public class GsonVideo {
	@SerializedName("file_id")
	public final String id = null;
	public final Long width = null;
	public final Long height = null;
	public final Long duration = null;
	@SerializedName("thumb")
	public final GsonPhotoSize thumbnail = null;
	@SerializedName("mime_type")
	public final String mimeType = null;
	@SerializedName("file_size")
	public final Long fileSize = null;
}
