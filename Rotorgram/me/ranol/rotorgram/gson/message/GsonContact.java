package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

public class GsonContact {
	@SerializedName("phone_number")
	public final String phone = null;
	@SerializedName("first_name")
	public final String firstName = null;
	@SerializedName("last_name")
	public final String lastName = null;
	@SerializedName("user_id")
	public final Long userId = null;

	@Override
	public String toString() {
		return "GsonContact{" +
				"phone='" + phone + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", userId=" + userId +
				'}';
	}
}
