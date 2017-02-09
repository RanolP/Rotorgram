package me.ranol.rotorgram.api.object;

import com.sun.org.apache.bcel.internal.generic.IREM;
import me.ranol.rotorgram.api.object.inline.ChosenInlineResult;
import me.ranol.rotorgram.api.object.inline.InlineQuery;
import me.ranol.rotorgram.api.object.message.Message;
import me.ranol.rotorgram.api.object.message.MessageType;
import me.ranol.rotorgram.gson.GsonUpdate;
import me.ranol.rotorgram.gson.message.GsonMessage;
import me.ranol.rotorgram.utils.Util;

import java.util.function.Function;

public class Update extends Validatable<GsonUpdate> {
	private InlineQuery iquery;
	private ChosenInlineResult result;

	public Update(GsonUpdate handle) {
		super(handle);
		iquery = new InlineQuery(handle.inlineQuery);
		result = new ChosenInlineResult(handle.chosenInlineResult);
	}

	public Message getMessage() {
		return getMessage(Message::new);
	}

	public <T extends Message> T getMessage(Function<GsonMessage, T> func) {
		return func.apply(handle.incomingMessage);
	}

	public long getId() {
		return Util.convert(handle.id);
	}

	public boolean hasMessage() {
		return handle.incomingMessage != null;
	}

	public boolean hasInlineQuery() {
		return iquery.isValid();
	}

	public InlineQuery getInlineQuery() {
		return iquery;
	}

	public ChosenInlineResult getChosenInlineResult() {
		return result;
	}

	public boolean hasChosenInlineResult() {
		return result.isValid();
	}

	public MessageType getMessageType() {
		return Message.parseType(handle.incomingMessage);
	}
}
