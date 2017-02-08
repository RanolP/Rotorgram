package me.ranol.rotorgram.utils;

public class Wrap<T> {
	T handle;

	private Wrap(T object) {
		set(object);
	}

	public T get() {
		return handle;
	}

	public void set(T object) {
		this.handle = object;
	}

	public static <T> Wrap<T> empty() {
		return new Wrap<T>(null);
	}

	public static <T> Wrap<T> of(T object) {
		return new Wrap<T>(object);
	}
}
