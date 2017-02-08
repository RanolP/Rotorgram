package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

public class GsonForceReply {
	@SerializedName("force_reply")
	public Boolean forceReply = false;
	public Boolean selective = false;
}
