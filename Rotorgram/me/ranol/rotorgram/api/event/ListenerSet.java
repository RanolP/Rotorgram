package me.ranol.rotorgram.api.event;

import java.util.HashSet;
import java.util.Set;

public class ListenerSet extends Listener {
	private Set<Listener> listeners = new HashSet<>();

	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void callEvent(CallableEvent e) {
		super.callEvent(e);
		for (Listener l : listeners) {
			l.callEvent(e);
		}
	}
}
