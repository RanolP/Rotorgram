package me.ranol.rotorgram.gson.message;

import me.ranol.rotorgram.gson.GsonUser;

public class GsonMessageEntity {
	public final String type = null;
	public final Long offset = null;
	public final Long length = null;
	public final String url = null;
	public final GsonUser user = null;

	@Override
	public String toString() {
		return "GsonMessageEntity{" +
				"type='" + type + '\'' +
				", offset=" + offset +
				", length=" + length +
				", url='" + url + '\'' +
				", user=" + user +
				'}';
	}
}
