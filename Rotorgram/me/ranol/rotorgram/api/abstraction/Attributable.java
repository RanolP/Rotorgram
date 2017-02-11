package me.ranol.rotorgram.api.abstraction;

import java.util.Set;

public interface Attributable {
	public <T> void set(AttributeKey<T> key, T object);

	public <T> T get(AttributeKey<T> key, T def);

	public default <T> T get(AttributeKey<T> key) {
		return get(key, null);
	}

	public default float getFloat(AttributeKey<Float> key) {
		return get(key, 0f);
	}

	public default double getDouble(AttributeKey<Double> key) {
		return get(key, 0d);
	}

	public default long getLong(AttributeKey<Long> key) {
		return get(key, 0L);
	}

	public default int getInt(AttributeKey<Integer> key) {
		return get(key, 0);
	}

	public default short getShort(AttributeKey<Short> key) {
		return get(key, (short) 0);
	}

	public default byte getByte(AttributeKey<Byte> key) {
		return get(key, (byte) 0);
	}

	public default boolean getBoolean(AttributeKey<Boolean> key) {
		return get(key, false);
	}

	public default char getChar(AttributeKey<Character> key) {
		return get(key, (char) 0);
	}

	public default String getString(AttributeKey<String> key) {
		return get(key, "");
	}

	public boolean contains(AttributeKey key);

	public Set<AttributeKey> keySet();
}
