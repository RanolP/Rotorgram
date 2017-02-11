package me.ranol.rotorgram.api.abstraction;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;

public class AttributeSerializer implements JsonSerializer<SimpleAttributable>, JsonDeserializer<SimpleAttributable> {

	@Override
	public SimpleAttributable deserialize(JsonElement e, Type t,
										  JsonDeserializationContext c) throws JsonParseException {
		try {
			SimpleAttributable result = (SimpleAttributable) Class.forName(t.getTypeName()).newInstance();
			if (e.isJsonObject()) {
				JsonObject o = e.getAsJsonObject();
				for (Map.Entry<String, JsonElement> key : o.entrySet()) {
					AttributeKey k = result.getKey(key.getKey());
					result.set(k, c.deserialize(key.getValue(), k.getType()));
				}
			}
			if (result instanceof Initializable) {
				((Initializable) result).initialize();
			}
			return result;
		} catch (Exception ex) {

		}
		return null;
	}

	@Override
	public JsonElement serialize(SimpleAttributable a, Type t, JsonSerializationContext c) {
		JsonObject o = new JsonObject();
		for (AttributeKey key : a.keySet()) {
			o.add(key.name(), c.serialize(a.get(key)));
		}
		return o;
	}
}
