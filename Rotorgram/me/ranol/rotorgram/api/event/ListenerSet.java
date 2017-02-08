package me.ranol.rotorgram.api.event;

import java.util.List;
import java.util.Map.Entry;

public class ListenerSet extends Listener {
	public void addListener(Listener listener) {
		for (Entry<Class<CallableEvent>, List<EventListener<CallableEvent>>> e : listener.registerSet()
			.entrySet()) {
			Class<CallableEvent> clazz = e.getKey();
			for (EventListener<CallableEvent> l : e.getValue()) {
				registerListener(clazz, l);
			}
		}
	}
	
	@Override
	public void callEvent(CallableEvent e) {
		super.callEvent(e);
	}
}
