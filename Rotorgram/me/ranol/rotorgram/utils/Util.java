package me.ranol.rotorgram.utils;

public class Util {
	public static boolean convert(Boolean val) {
		return val != null && val;
	}

	public static long convert(Long val) {
		return val != null ? val : 0L;
	}
}
