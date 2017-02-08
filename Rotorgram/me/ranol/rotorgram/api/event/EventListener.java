package me.ranol.rotorgram.api.event;

@FunctionalInterface
public interface EventListener<T extends CallableEvent> {
    public void receive(T event);
}
