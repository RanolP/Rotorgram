package me.ranol.rotorgram.api.command;

@FunctionalInterface
public interface CommandExecutor {
	public boolean onCommand(CommandData data);
}
