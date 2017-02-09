package me.ranol.rotorgram.api.object;

public class Validatable<T> {
	protected T handle;

	public Validatable(T handle) {
		this.handle = handle;
	}

	public boolean isValid() {
		return handle != null;
	}
}
