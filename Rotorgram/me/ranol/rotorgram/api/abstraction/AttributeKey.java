package me.ranol.rotorgram.api.abstraction;

public class AttributeKey<T> {
	private String name;
	private Class<T> clazz;

	public AttributeKey(String name, Class<T> clazz) {
		this.name = name;
		this.clazz = clazz;
	}

	public String name() {
		return name;
	}

	public Class<T> getType() {
		return clazz;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AttributeKey<?> that = (AttributeKey<?>) o;

		return name != null ? name.equals(that.name) : that.name == null;

	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
