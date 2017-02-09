package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

public class GsonAudio extends GsonFile {
	public final Long duration = null;
	@SerializedName("performer")
	public final String performer = null;
	public final String title = null;
	@SerializedName("mime_type")
	public final String mimeType = null;

	@Override
	public String toString() {
		return "GsonAudio{" +
				"duration=" + duration +
				", performer='" + performer + '\'' +
				", title='" + title + '\'' +
				", mimeType='" + mimeType + '\'' +
				'}';
	}
}
