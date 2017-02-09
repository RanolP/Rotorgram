package me.ranol.rotorgram.gson;

import com.google.gson.annotations.SerializedName;

public class GsonChat extends GsonUser {
	public final String type = null;
	public final String title = null;
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
