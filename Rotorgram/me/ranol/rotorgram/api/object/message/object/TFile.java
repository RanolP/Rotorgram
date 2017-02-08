package me.ranol.rotorgram.api.object.message.object;

import me.ranol.rotorgram.Requester;
import me.ranol.rotorgram.gson.message.GsonFile;
import me.ranol.rotorgram.utils.Util;

import java.io.File;

public class TFile<T extends GsonFile> {
	T handle;

	public TFile(T file) {
		this.handle = file;
	}

	public String getId() {
		return handle.id;
	}

	public String getPath() {
		return handle.filePath;
	}

	public long getSize() {
		return Util.convert(handle.fileSize);
	}

	public boolean download(File to) {
		return Requester.download(getPath(), to);
	}

	public boolean download(String to) {
		return download(new File(to));
	}
}