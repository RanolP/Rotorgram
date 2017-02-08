package me.ranol.rotorgram;

import com.google.gson.JsonElement;
import me.ranol.rotorgram.annotations.Required;
import me.ranol.rotorgram.api.event.*;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.gson.GsonChat;
import me.ranol.rotorgram.gson.GsonUser;
import me.ranol.rotorgram.gson.inline.InlineQueryResult;
import me.ranol.rotorgram.gson.message.GsonMessage;

import java.io.IOException;

public class TelegramBot extends Listener {
	private String token;
	private UpdateLooper looper;
	private ListenerSet listener = new ListenerSet();
	private GsonUser me;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public final void start() {
		try {
			me = GsonManager.parse(Requester.request("getMe")
											.getAsJsonObject()
											.get("result"), GsonUser.class);
			if (token == null) throw new IllegalStateException("Token must be non-null value.");
			looper = new UpdateLooper();
			Static.setBot(this);
			System.out.println("이 봇은 Rotorgram을 사용합니다.");
			System.out.println("절대로 프로세스 강제종료, 창 닫기 등이 아닌, 콘솔에 키를 입력하여 종료해주세요.");
			System.out.println("아무 키를 누르면 종료합니다.");
			listeners();
			onStart();
			listener.addListener(this);
			new Thread(() -> {
				try {
					System.in.read();
					System.out.println("사용해주셔서 감사합니다, 봇이 종료되었습니다.");
					stop();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
		} catch (Exception e) {
		}
	}

	private final void listeners() {
		registerListener(UpdateEvent.class, e -> {
			if (e.update.incomingMessage != null) {
				GsonMessage incoming = e.update.incomingMessage;
				switch (Message.parseType(incoming)) {
					case AUDIO:
					case CHANNEL_CREATE:
					case CONTACT:
					case DOCUMENT:
					case FILE:
					case GROUP_CREATE:
					case JOIN_USER:
					case LEFT_USER:
					case PINNING_MESSAGE:
					case REMOVE_CHAT_PHOTO:
					case SET_CHAT_PHOTO:
					case STICKER:
					case SUPER_GROUP_CREATE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case TEXT:
						Static.callEvent(new TextMessageEvent(incoming));
						break;
					case VENUE:
					case VIDEO:
					case VOICE:
					case UNKNOWN:
					default:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
				}
			}
			if (e.update.inlineQuery != null) {
				Static.callEvent(new InlineQueryEvent(e.update.inlineQuery));
			}
		});
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

	public JsonElement answerInlineQuery(@Required String inlineQueryId, @Required InlineQueryResult[] results,
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

	public ListenerSet getListeners() {
		return listener;
	}
}
