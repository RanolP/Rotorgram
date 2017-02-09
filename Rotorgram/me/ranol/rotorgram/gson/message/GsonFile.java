package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

public class GsonFile {
	@SerializedName("file_id")
	public final String id = null;
	@SerializedName("file_size")
	public final Long fileSize = null;
	@SerializedName("file_path")
	public final String filePath = null;

	@Override
	public String toString() {
		return "GsonFile{" +
				"id='" + id + '\'' +
				", fileSize=" + fileSize +
				", filePath='" + filePath + '\'' +
				'}';
	}
}
