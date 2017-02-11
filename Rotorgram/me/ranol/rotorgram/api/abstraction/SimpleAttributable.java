package me.ranol.rotorgram.api.abstraction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleAttributable implements Attributable {
	private static final HashSet<Class> c = new HashSet<>();

	private HashMap<AttributeKey, Object> set = new HashMap<>();

	@Override
	public <T> void set(AttributeKey<T> key, T object) {
		set.put(key, object);
	}

	@Override
	public <T> T get(AttributeKey<T> key, T def) {
		if (contains(key)) {
			return (T) set.get(key);
		}
		return def;
	}

	@Override
	public boolean contains(AttributeKey key) {
		return set.get(key) != null;
	}

	@Override
	public Set<AttributeKey> keySet() {
		return set.keySet();
	}

	protected void addKeys(AttributeKey... keys) {
		for (AttributeKey key : keys) {
			set.put(key, null);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + keySet().stream()
														  .filter(this::contains)
														  .map(k -> k.name() + "=" + get(k))
														  .collect(Collectors.joining(", ")) + "}";
	}

	public static <T extends SimpleAttributable> T mapping(T origin, Attributable at) {
		for (AttributeKey key : at.keySet()) {
			if (!origin.contains(key)) continue;
			origin.set(key, at.get(key));
		}
		return origin;
	}

	protected AttributeKey getKey(String name) {
		for (AttributeKey k : set.keySet()) {
			if (k.name().equals(name)) return k;
		}
		return null;
	}
}
