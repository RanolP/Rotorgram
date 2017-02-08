package me.ranol.rotorgram.gson.inline;

import com.google.gson.annotations.SerializedName;

import me.ranol.rotorgram.gson.GsonLocation;
import me.ranol.rotorgram.gson.GsonUser;

public class InlineQuery {
	public final String id = null;
	@SerializedName("from")
	public final GsonUser fromUser = null;
	public final GsonLocation location = null;
	public final String query = null;
	public final String offset = null;
}
