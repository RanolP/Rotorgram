package me.ranol.rotorgram;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonManager {
	private static Gson gson = new GsonBuilder().setPrettyPrinting()
		.create();
	private static JsonParser parser = new JsonParser();

	public static <T> T parse(JsonElement json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}

	public static JsonElement parseString(String s) {
		return parser.parse(s);
	}

	public static JsonElement parse(Object o) {
		return parseString(gson.toJson(o));
	}

	public static JsonElement parseReader(Reader reader) {
		return parser.parse(reader);
	}

	public static JsonObject load(File target) {
		try (FileReader reader = new FileReader(target)) {
			JsonElement e = parser.parse(reader);
			return e instanceof JsonObject ? (JsonObject) e : new JsonObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JsonObject();
	}

	public static void save(JsonObject prop, File target) {
		try {
			Files.write(target.toPath(), gson.toJson(prop)
				.getBytes(StandardCharsets.UTF_8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
