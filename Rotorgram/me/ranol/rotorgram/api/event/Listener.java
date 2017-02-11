package me.ranol.rotorgram.api.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Listener {
	private HashMap<Class<CallableEvent>, List<EventListener<CallableEvent>>> listeners = new HashMap<>();

	protected void callEvent(CallableEvent e) {
		Class<?> clazz = e.getClass();
		while (clazz != null && CallableEvent.class.isAssignableFrom(clazz)) {
			if (listeners.containsKey(clazz)) {
				for (EventListener<CallableEvent> l : listeners.get(clazz)) {
					l.receive(e);
				}
			}
			clazz = clazz.getSuperclass();
		}
	}

	public <T extends CallableEvent> void registerListener(Class<T> clazz, EventListener<T> listener) {
		if (!listeners.containsKey(clazz)) listeners.put((Class<CallableEvent>) clazz, new ArrayList<>());
		listeners.get(clazz)
				 .add((EventListener<CallableEvent>) listener);
	}
}
