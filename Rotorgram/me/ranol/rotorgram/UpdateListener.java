package me.ranol.rotorgram;

import me.ranol.rotorgram.api.event.InlineQueryEvent;
import me.ranol.rotorgram.api.event.Listener;
import me.ranol.rotorgram.api.event.UpdateEvent;
import me.ranol.rotorgram.api.event.message.SimpleMessageEvent;
import me.ranol.rotorgram.api.event.message.StickerMessageEvent;
import me.ranol.rotorgram.api.event.message.TextMessageEvent;
import me.ranol.rotorgram.api.event.user.UserJoinEvent;
import me.ranol.rotorgram.api.event.user.UserLeftEvent;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.gson.message.GsonMessage;

public class UpdateListener extends Listener {
	{
		registerListener(UpdateEvent.class, e -> {
			if (e.update.incomingMessage != null) {
				GsonMessage incoming = e.update.incomingMessage;
				switch (Message.parseType(incoming)) {
					case AUDIO:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case CHANNEL_CREATE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case CONTACT:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case DOCUMENT:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case GROUP_CREATE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case JOIN_USER:
						Static.callEvent(new UserJoinEvent(incoming));
						break;
					case LEFT_USER:
						Static.callEvent(new UserLeftEvent(incoming));
						break;
					case PINNING_MESSAGE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case REMOVE_CHAT_PHOTO:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case SET_CHAT_PHOTO:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case STICKER:
						Static.callEvent(new StickerMessageEvent(incoming));
						break;
					case SUPER_GROUP_CREATE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case TEXT:
						Static.callEvent(new TextMessageEvent(incoming));
						break;
					case VENUE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case VIDEO:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
					case VOICE:
						Static.callEvent(new SimpleMessageEvent(incoming));
						break;
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
}
