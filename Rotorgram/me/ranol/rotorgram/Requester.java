package me.ranol.rotorgram;

import com.google.gson.JsonElement;
import me.ranol.rotorgram.gson.message.GsonFile;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Map;
import java.util.Map.Entry;

public class Requester {
	private static final String API_URL = "https://api.telegram.org/";
	private static final String FILE_URL = "https://api.telegram.org/files/";

	public static boolean download(String path, File to) {
		try {
			HttpPost post = new HttpPost(FILE_URL + "bot" + Static.getBotToken() + "/" + path);
			HttpClient c = HttpClientBuilder.create().build();
			HttpResponse r = c.execute(post);
			byte[] array = new byte[0];
			try (InputStream s = r.getEntity().getContent()) {
				array = new byte[s.available()];
				s.read(array);
			}
			Files.write(to.toPath(), array);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private static JsonElement request0(String url, Map<String, String> entries) {
		try {
			HttpPost post = new HttpPost(url);
			if (entries != null && !entries.isEmpty()) {
				MultipartEntityBuilder builder = MultipartEntityBuilder.create();
				ContentType t = ContentType.create("text/plain", Consts.UTF_8);
				for (Entry<String, String> e : entries.entrySet()) {
					builder.addTextBody(e.getKey(), e.getValue(), t);
				}
				post.setEntity(builder.build());
			}
			HttpClient c = HttpClientBuilder.create()
											.build();
			HttpResponse response = c.execute(post);
			return GsonManager.parseReader(new InputStreamReader(response.getEntity()
																		 .getContent()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JsonElement request(String function, Map<String, String> entries) {
		return request0(API_URL + "bot" + Static.getBotToken() + "/" + function, entries);
	}

	public static JsonElement request(String function) {
		return request(function, null);
	}

	public static JsonElement getUpdates(Long offset) {
		return request(
				"getUpdates", new EntryBuilder().addIf(offset != null, "offset", Long.toString(offset.longValue()))
												.add("timeout", "100")
												.build());
	}
}
