package me.ranol.rotorgram.gson.inline;

import com.google.gson.annotations.SerializedName;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import me.ranol.rotorgram.gson.GsonLocation;
import me.ranol.rotorgram.gson.GsonUser;

public class GsonChosenInlineResult {
	@SerializedName("result_id")
	public final String id = null;
	@SerializedName("from")
	public final GsonUser fromUser = null;
	public final GsonLocation location = null;
	@SerializedName("inline_message_id")
	public final String inlineMessageId = null;
	public final String query = null;
}
