package me.ranol.rotorgram;

import me.ranol.rotorgram.api.event.InlineQueryEvent;
import me.ranol.rotorgram.api.event.message.SimpleMessageEvent;
import me.ranol.rotorgram.api.event.message.StickerMessageEvent;
import me.ranol.rotorgram.api.event.message.TextMessageEvent;
import me.ranol.rotorgram.api.event.user.UserJoinEvent;
import me.ranol.rotorgram.api.event.user.UserLeftEvent;
import me.ranol.rotorgram.api.object.inline.TextQueryResult;
import me.ranol.rotorgram.api.object.message.TextMessage;
import me.ranol.rotorgram.api.object.message.builder.TextMessageBuilder;
import me.ranol.rotorgram.gson.inline.InlineQueryResult;

public class TestRanolBot extends TelegramBot {
	TextQueryResult result = new TextQueryResult();

	{
		result.setVisibleString("탕냥이 귀여워").setString("*탕냥이 기여어!*").setParseMode("MARKDOWN");
	}

	@Override
	public void onStart() {
		registerListener(TextMessageEvent.class, e -> {
			String room;
			if (e.hasChat() && e.getChat().hasTitle()) {
				room = "[" + e.getChat().getTitle() + "]";
			} else {
				room = "";
			}
			if (room.contains("null")) room = "";
			String user = "Unknown";
			if (e.hasMessageSender()) user = "@" + e.getMessageSender().getUsername();
			System.out.println((room + " " + user + " : " + e.getMessageText() + " / " + e.getMessageType()).trim());
		});
		registerListener(UserJoinEvent.class, e -> {
			new TextMessageBuilder().message("어서와, " + e.getJoinedUser().getUsername())
									.id(e.getChatId())
									.reply(e.getMessage().getId()).send();
		});
		registerListener(UserLeftEvent.class, e -> {
			System.out.println(new TextMessageBuilder().message("잘가, " + e.getLeftedUser().getUsername())
													   .id(e.getChatId())
													   .reply(e.getMessage().getId()).send());
		});
		registerListener(StickerMessageEvent.class, e -> {
			String room;
			if (e.hasChat() && e.getChat().hasTitle()) {
				room = "[" + e.getChat().getTitle() + "]";
			} else {
				room = "";
			}
			if (room.contains("null")) room = "";
			String user = "Unknown";
			if (e.hasMessageSender()) user = "@" + e.getMessageSender().getUsername();
			System.out.println(
					(room + " " + user + " : " + e.getStickerEmoji() + "(" + e.getStickerId() + ")" + " / " + e.getMessageType())
							.trim());
		});
		registerListener(SimpleMessageEvent.class, e -> {
			String room;
			if (e.hasChat() && e.getChat().hasTitle()) {
				room = "[" + e.getChat().getTitle() + "]";
			} else {
				room = "";
			}
			if (room.contains("null")) room = "";
			String user = "Unknown";
			if (e.hasMessageSender()) user = "@" + e.getMessageSender().getUsername();
			System.out.println((room + " " + user + " : " + e.getMessageType()).trim());
		});
		registerListener(InlineQueryEvent.class, e -> {
			switch (e.query.query) {
				case "":
				case "xkd":
					answerInlineQuery(e.query.id, new InlineQueryResult[] {result.get(e.query.id)}, null, null, null,
									  null);
					break;
			}
		});
	}
}
