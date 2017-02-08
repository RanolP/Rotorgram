package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

public class GsonResponseParameters {
	@SerializedName("migrate_to_chat_id")
	public Long migrateToId = null;
	@SerializedName("retry_after")
	public Long retryAfter = null;
}
