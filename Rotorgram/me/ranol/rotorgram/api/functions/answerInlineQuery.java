package me.ranol.rotorgram.api.functions;

import me.ranol.rotorgram.EntryBuilder;
import me.ranol.rotorgram.api.object.inline.result.QueryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class answerInlineQuery extends VoidFunction {
	private String id;
	private List<QueryResult> results = new ArrayList<>();
	private Long cacheTime;
	private Boolean personal;
	private String nextOffset;
	private String switchPMParameter;
	private String switchPMText;

	public answerInlineQuery() {
		setFunctionName("answerInlineQuery");
	}

	public answerInlineQuery id(String id) {
		this.id = id;
		return this;
	}

	public answerInlineQuery add(QueryResult res) {
		res.makeId();
		results.add(res);
		return this;
	}

	public answerInlineQuery remove(QueryResult res) {
		results.remove(res);
		return this;
	}

	public answerInlineQuery clearResults() {
		results.clear();
		return this;
	}

	public answerInlineQuery cache(Long time) {
		this.cacheTime = time;
		return this;
	}

	public answerInlineQuery personal(Boolean personal) {
		this.personal = personal;
		return this;
	}

	public answerInlineQuery nextOffset(String offset) {
		this.nextOffset = offset;
		return this;
	}

	public answerInlineQuery switchPMParameter(String param) {
		this.switchPMParameter = param;
		return this;
	}

	public answerInlineQuery switchPMText(String text) {
		this.switchPMText = text;
		return this;
	}

	@Override
	protected HashMap<String, String> getArguments() {
		return new EntryBuilder().add("inline_query_id", id)
								 .addArray("results", results.toArray(new QueryResult[0]))
								 .addIfNonNull("cache_time", cacheTime)
								 .addIfNonNull("is_personal", personal)
								 .addIfNonNull("next_offset", nextOffset)
								 .addIfNonNull("switch_pm_parameter",
											   switchPMParameter)
								 .addIfNonNull("switch_pm_text",
											   switchPMText)
								 .build();
	}
}
