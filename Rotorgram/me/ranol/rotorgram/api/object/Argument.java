package me.ranol.rotorgram.api.object;

public class Argument {
	private final String key;
	private final String value;

	public Argument(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
