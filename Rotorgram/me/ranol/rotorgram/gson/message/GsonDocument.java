package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonPhotoSize;

public class GsonDocument {
	@SerializedName("file_id")
	public final String id = null;
	@SerializedName("thumb")
	public final GsonPhotoSize thumbnail = null;
	@SerializedName("file_name")
	public final String name = null;
	@SerializedName("mime_type")
	public final String mimeType = null;
	@SerializedName("file_size")
	public final Long fileSize = null;
}