package me.ranol.rotorgram;

import java.util.HashMap;

public class EntryBuilder {
	private HashMap<String, String> map = new HashMap<>();

	public EntryBuilder add(String k, String v) {
		map.put(k, v);
		return this;
	}

	public EntryBuilder addIf(boolean b, String k, String v) {
		if (b) add(k, v);
		return this;
	}

	public EntryBuilder addIf(boolean b, String k, Object o) {
		if (b) add(k, o.toString());
		return this;
	}

	public EntryBuilder addIfNot(boolean b, String k, String v) {
		if (!b) add(k, v);
		return this;
	}

	public EntryBuilder addIfNonNull(String k, String v) {
		return addIf(v != null, k, v);
	}

	public EntryBuilder addIfNonNull(String k, Object o) {
		return addIf(o != null, k, o);
	}

	public HashMap<String, String> build() {
		return map;
	}

	public EntryBuilder addArray(String k, Object[] results) {
		return add(k, GsonManager.parse(results)
								 .toString());
	}

	public EntryBuilder addArrayIf(boolean b, String k, Object[] results) {
		return addIf(b, k, GsonManager.parse(results)
									  .toString());
	}

	public EntryBuilder addArrayIfNot(boolean b, String k, Object[] results) {
		return addIfNot(b, k, GsonManager.parse(results)
										 .toString());
	}
}
