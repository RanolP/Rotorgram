package me.ranol.rotorgram.api.event;

import me.ranol.rotorgram.gson.inline.InlineQuery;

public class InlineQueryEvent extends CallableEvent {
    public final InlineQuery query;

    public InlineQueryEvent(InlineQuery query) {
        this.query = query;
    }
}
