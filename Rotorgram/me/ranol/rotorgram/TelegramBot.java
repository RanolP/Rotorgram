package me.ranol.rotorgram;

import me.ranol.rotorgram.api.BotProperty;
import me.ranol.rotorgram.api.event.*;
import me.ranol.rotorgram.api.functions.getMe;
import me.ranol.rotorgram.api.object.users.User;

import java.io.File;
import java.io.IOException;

public class TelegramBot extends ListenerSet {
	private String token;
	private UpdateLooper looper;
	private User me;
	private BotProperty prop;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public final void start() {
		me = new getMe().invoke();
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

	public User getMe() {
		return me;
	}

	public BotProperty getProperty() {
		return prop;
	}

	public void saveProperty() {
		prop.save();
	}
}
