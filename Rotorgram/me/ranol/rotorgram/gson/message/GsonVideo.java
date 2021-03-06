package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonPhotoSize;

public class GsonVideo extends GsonFile {
	public final Long width = null;
	public final Long height = null;
	public final Long duration = null;
	@SerializedName("thumb")
	public final GsonPhotoSize thumbnail = null;
	@SerializedName("mime_type")
	public final String mimeType = null;

	@Override
	public String toString() {
		return "GsonVideo{" +
				"width=" + width +
				", height=" + height +
				", duration=" + duration +
				", thumbnail=" + thumbnail +
				", mimeType='" + mimeType + '\'' +
				'}';
	}
}
