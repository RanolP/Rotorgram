package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.gson.GsonUpdate;

public class UpdateEvent extends CallableEvent {
	public final GsonUpdate update;

	public UpdateEvent(GsonUpdate update) {
		this.update = update;
	}
}
