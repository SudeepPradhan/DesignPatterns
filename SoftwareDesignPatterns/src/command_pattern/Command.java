package command_pattern;

public interface Command {
	public void execute(int value);
	public void undo(int value);
}
