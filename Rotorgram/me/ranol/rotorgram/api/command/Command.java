package me.ranol.rotorgram.api.command;

import java.util.List;

public class Command implements CommandExecutor {
	private String label;
	private List<String> aliases;
	private String usage;
	private CommandExecutor executor;

	@Override
	public boolean onCommand(CommandData data) {
		if (executor != null) {
			return executor.onCommand(data);
		}
		return false;
	}
}
