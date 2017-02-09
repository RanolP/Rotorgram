package me.ranol.rotorgram.api.object;

public enum ChatType {
	PRIVATE("private"),
	GROUP("group"),
	SUPERGROUP("supergroup"),
	CHANNEL("channel"),
	UNKNOWN(null);

	String name;

	ChatType(String name) {
		this.name = name;
	}

	public static ChatType byName(String name) {
		for (ChatType type : values()) {
			if (type.name.equals(name)) return type;
		}
		return UNKNOWN;
	}
}
