package me.ranol.rotorgram;

import com.google.gson.JsonElement;
import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.api.BotProperty;
import me.ranol.rotorgram.api.event.*;
import me.ranol.rotorgram.gson.GsonChat;
import me.ranol.rotorgram.gson.GsonUser;
import me.ranol.rotorgram.gson.inline.GsonInlineQueryResult;

import java.io.File;
import java.io.IOException;

public class TelegramBot extends ListenerSet {
	private String token;
	private UpdateLooper looper;
	private GsonUser me;
	private BotProperty prop;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public final void start() {
		me = GsonManager.parse(Requester.request("getMe")
										.getAsJsonObject()
										.get("result"), GsonUser.class);
		if (token == null) throw new IllegalStateException("Token must be non-null value.");
		prop = new BotProperty(new File(System.getProperty("user.dir"), "BotConfig.json"));
		looper = new UpdateLooper();
		Static.setBot(this);
		System.out.println("이 봇은 Rotorgram을 사용합니다.");
		System.out.println("절대로 프로세스 강제종료, 창 닫기 등이 아닌, 콘솔에 키를 입력하여 종료해주세요.");
		System.out.println("아무 키를 누르면 종료합니다.");
		listeners();
		onStart();
		new Thread(() -> {
			try {
				System.in.read();
				System.out.println("사용해주셔서 감사합니다, 봇이 종료되었습니다.");
				stop();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();
	}

	private void listeners() {
		addListener(new UpdateListener());
	}

	public final void stop() {
		looper.stop();
		onStop();
		System.exit(-1);
	}

	public void onStart() {

	}

	public void onStop() {

	}

	public GsonUser getMe() {
		return me;
	}

	public JsonElement sendMessage(@Required GsonChat chat, @Required String message, Boolean notify, Long replyTo,
								   String parseMode, Boolean webPagePreview) {
		return sendMessage(chat.id, message, notify, replyTo, parseMode, webPagePreview);
	}

	public JsonElement sendMessage(@Required Long chatId, @Required String message, Boolean notify, Long replyTo,
								   String parseMode, Boolean webPagePreview) {
		return sendMessage(Long.toString(chatId), message, notify, replyTo, parseMode, webPagePreview);
	}

	public JsonElement sendMessage(@Required String chatId, @Required String message, Boolean notify, Long replyTo,
								   String parseMode, Boolean webPagePreview) {
		return Requester.request("sendMessage", new EntryBuilder().add("chat_id", chatId)
																  .add("text", message)
																  .addIf(notify != null && !notify,
																		 "disable_notification", "false")
																  .addIfNonNull("reply_to_text_id", replyTo)
																  .addIfNonNull("parse_mode", parseMode)
																  .addIf(webPagePreview != null && !webPagePreview,
																		 "disable_web_page_preview", "true")
																  .build());
	}

	public JsonElement answerInlineQuery(@Required String inlineQueryId, @Required GsonInlineQueryResult[] results,
										 Long cacheTime, Boolean personal, String nextOffset,
										 String switchPMParameter) {
		return Requester.request("answerInlineQuery", new EntryBuilder().add("inline_query_id", inlineQueryId)
																		.addArray("results", results)
																		.addIfNonNull("cache_time", cacheTime)
																		.addIfNonNull("is_personal", personal)
																		.addIfNonNull("next_offset", nextOffset)
																		.addIfNonNull("switch_pm_parameter",
																					  switchPMParameter)
																		.build());
	}

	public BotProperty getProperty() {
		return prop;
	}

	public void saveProperty() {
		prop.save();
	}
}
