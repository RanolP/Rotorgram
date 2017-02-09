package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

public class GsonUser {
	public final Long id = null;
	@SerializedName("first_name")
	public final String firstName = null;
	@SerializedName("last_name")
	public final String lastName = null;
	public final String username = null;

	@Override
	public String toString() {
		return "GsonUser{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", username='" + username + '\'' +
				'}';
	}
}
