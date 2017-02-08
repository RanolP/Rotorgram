package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

public class GsonChat {
	public final Long id = null;
	public final String type = null;
	public final String title = null;
	public final String username = null;
	@SerializedName("first_name")
	public final String firstName = null;
	@SerializedName("last_name")
	public final String lastName = null;
	@SerializedName("all_members_are_administrators")
	public final Boolean allMemberAdmin = null;

	@Override
	public String toString() {
		return "GsonChat{" +
				"id=" + id +
				", type='" + type + '\'' +
				", title='" + title + '\'' +
				", username='" + username + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", allMemberAdmin=" + allMemberAdmin +
				'}';
	}
}
