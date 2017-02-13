package me.ranol.rotorgram;

import me.ranol.rotorgram.api.event.InlineQueryEvent;
import me.ranol.rotorgram.api.event.message.SimpleMessageEvent;
import me.ranol.rotorgram.api.event.message.StickerMessageEvent;
import me.ranol.rotorgram.api.event.message.TextMessageEvent;
import me.ranol.rotorgram.api.event.user.UserJoinEvent;
import me.ranol.rotorgram.api.event.user.UserLeftEvent;
import me.ranol.rotorgram.api.functions.answerInlineQuery;
import me.ranol.rotorgram.api.functions.sendMessage;
import me.ranol.rotorgram.api.object.inline.result.TextQueryResult;

public class TestRanolBot extends TelegramBot {
	TextQueryResult xkd = new TextQueryResult();
	TextQueryResult finalchild = new TextQueryResult();
	TextQueryResult ggung = new TextQueryResult();
	TextQueryResult tr = new TextQueryResult();
	TextQueryResult cc = new TextQueryResult();

	{
		cc.title("circlt?").text("`Circlt` 따위 없다, *GgungAh* 마이 웨이").parseMode("MARKDOWN");
		xkd.title("탕냥이 귀여워").text("*탕냥이 기여어!*").parseMode("MARKDOWN");
		finalchild.title("파차님 찬양").text("*파차님 갱장헤!*").parseMode("MARKDOWN");
		ggung.title("껑아").text("*GgungAh* 껑아").parseMode("MARKDOWN");
		tr.title("태룡").text("*xkd :* 태룡님은 어디에 계시는가.").parseMode("MARKDOWN");
	}

	@Override
	public void onStart() {
		registerListener(TextMessageEvent.class, e -> {
			String message = "";
			if (e.hasChat() && e.getChat().hasTitle()) {
				message += "[" + e.getChat().getTitle() + "]";
			}
			if (e.hasMessageSender()) message += " @" + e.getMessageSender().getUsername();
			System.out.println((message + " : " + e.getMessageText() + " / " + e.getMessageType()).trim());
		});
		registerListener(UserJoinEvent.class, e -> {
			new sendMessage().id(e.getChatId())
							 .text("어서와, " + e.getJoinedUser().getUsername())
							 .reply(e.getMessage().getId())
							 .invoke();
		});
		registerListener(UserLeftEvent.class, e -> {
			new sendMessage().id(e.getChatId())
							 .text("잘가, " + e.getLeftedUser().getUsername())
							 .reply(e.getMessage().getId())
							 .invoke();
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
			switch (e.getQueryText()) {
				case "":
					new answerInlineQuery().id(e.getQueryId())
										   .add(cc)
										   .add(ggung)
										   .add(finalchild)
										   .add(xkd)
										   .add(tr)
										   .invoke();
					break;
				case "ggung":
					new answerInlineQuery().id(e.getQueryId()).add(ggung).invoke();
					break;
				case "xkd":
					new answerInlineQuery().id(e.getQueryId()).add(xkd).invoke();
					break;
				case "fc":
					new answerInlineQuery().id(e.getQueryId()).add(finalchild).invoke();
				case "tr":
					new answerInlineQuery().id(e.getQueryId()).add(tr).invoke();
				case "cc":
					new answerInlineQuery().id(e.getQueryId()).add(cc).invoke();
					break;
			}
		});
	}
}
