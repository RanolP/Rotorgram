package me.ranol.rotorgram;

import java.util.Timer;
import java.util.TimerTask;

import me.ranol.rotorgram.api.event.CallableEvent;

public class Static {
	private TelegramBot bot;


	private static final class Singleton {
		static final Static instance = new Static();
	}

	private static Static getInstance() {
		return Singleton.instance;
	}

	public static TelegramBot getBot() {
		return getInstance().bot;
	}

	public static String getBotToken() {
		return getBot() != null ? getBot().getToken() : "";
	}

	public static Timer loopTask(Runnable r, int repeat) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				r.run();
			}
		}, 0, repeat);
		return timer;
	}

	protected static void setBot(TelegramBot bot) {
		if (getBot() != null) throw new UnsupportedOperationException("Cannot redefine bot");
		getInstance().bot = bot;
	}

	public static void startBot(Class<? extends TelegramBot> clazz, String token) {
		try {
			TelegramBot bot = clazz.newInstance();
			bot.setToken(token);
			bot.start();
		} catch (Exception e) {
		}
	}

	public static void callEvent(CallableEvent e) {
		getBot().callEvent(e);
	}
}
