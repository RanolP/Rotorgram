package me.ranol.rotorgram.gson.message;

import com.google.gson.annotations.SerializedName;

import com.sun.istack.internal.Nullable;
import me.ranol.rotorgram.gson.GsonChat;
import me.ranol.rotorgram.gson.GsonGame;
import me.ranol.rotorgram.gson.GsonLocation;
import me.ranol.rotorgram.gson.GsonPhotoSize;
import me.ranol.rotorgram.gson.GsonUser;

public class GsonMessage {
	@SerializedName("message_id")
	public final Long id = null;
	@SerializedName("from")
	public final GsonUser fromUser = null;
	public final Long date = null;
	public final GsonChat chat = null;
	@SerializedName("forward_from")
	public final GsonUser forwardFromUser = null;
	@SerializedName("forward_from_chat")
	public final GsonChat forwardFromChat = null;
	@SerializedName("forward_from_message_id")
	public final Long forwardFromId = null;
	@SerializedName("forward_date")
	public final Long forwardDate = null;
	@SerializedName("reply_to_message")
	public final GsonMessage reply = null;
	@SerializedName("edit_date")
	public final Long editDate = null;
	public final String text = null;
	public final GsonMessageEntity[] entities = null;
	public final GsonAudio audio = null;
	public final GsonDocument document = null;
	public final GsonGame game = null;
	public final GsonPhotoSize[] photo = null;
	public final GsonSticker sticker = null;
	public final GsonVideo video = null;
	public final GsonVoice voice = null;
	public final String caption = null;
	public final GsonContact contact = null;
	public final GsonLocation location = null;
	public final GsonVenue venue = null;
	@SerializedName("new_chat_member")
	public final GsonUser newMember = null;
	@SerializedName("left_chat_member")
	public final GsonUser leftMember = null;
	@SerializedName("new_chat_title")
	public final String newTitle = null;
	@SerializedName("new_chat_photo")
	public final GsonPhotoSize[] newPhoto = null;
	@SerializedName("delete_chat_photo")
	public final Boolean deleteChatPhoto = null;
	@SerializedName("group_chat_created")
	public final Boolean groupCreated = null;
	@SerializedName("supergroup_chat_created")
	public final Boolean superGroupCreated = null;
	@SerializedName("channel_chat_created")
	@Nullable
	public final Boolean channelCreated = null;
	@SerializedName("migrate_to_chat_id")
	public final Long migrateToId = null;
	@SerializedName("migrate_from_chat_id")
	public final Long migrateFromId = null;
	@SerializedName("pinned_message")
	public final GsonMessage pinnedMessage = null;

}
