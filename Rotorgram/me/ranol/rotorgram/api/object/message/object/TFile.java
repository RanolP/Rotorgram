package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.Requester;
import me.ranol.rotorgram.api.TelegramObject;
import me.ranol.rotorgram.api.abstraction.interfaces.StringIdObject;
import me.ranol.rotorgram.api.abstraction.keysets.OtherKeySet;

import java.io.File;

public class TFile extends TelegramObject implements StringIdObject, OtherKeySet {

	public TFile() {
		addKeys(FILE_ID, FILE_SIZE, FILE_PATH);
	}

	public String getId() {
		return getString(FILE_ID);
	}

	public String getPath() {
		return getString(FILE_PATH);
	}

	public long getSize() {
		return getLong(FILE_SIZE);
	}

	public boolean download(File to) {
		return Requester.download(getPath(), to);
	}

	public boolean download(String to) {
		return download(new File(to));
	}
}
