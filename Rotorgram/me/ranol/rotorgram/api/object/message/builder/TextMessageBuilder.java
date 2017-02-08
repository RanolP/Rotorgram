package me.ranol.rotorgram.api.object.message.builder;

import com.google.gson.JsonElement;
import me.ranol.rotorgram.EntryBuilder;
import me.ranol.rotorgram.Requester;

public class TextMessageBuilder extends MessageBuilder<TextMessageBuilder> {
	private String message;
	private String parseMode;
	private Boolean webPagePreview;

	{
		ret = this;
	}

	public TextMessageBuilder message(String msg) {
		this.message = msg;
		return this;
	}

	public TextMessageBuilder parseMode(String mode) {
		this.parseMode = mode;
		return this;
	}

	public TextMessageBuilder webPagePreview(boolean val) {
		webPagePreview = val;
		return this;
	}

	@Override
	public JsonElement send() {
		return Requester.request("sendMessage", new EntryBuilder().add("chat_id", id)
																  .add("text", message)
																  .addIf(disableNotification != null && disableNotification,
																		 "disable_notification", "true")
																  .addIfNonNull("reply_to_text_id", replyToMessageId)
																  .addIfNonNull("parse_mode", parseMode)
																  .addIf(webPagePreview != null && !webPagePreview,
																		 "disable_web_page_preview", "true")
																  .build());
	}
}
