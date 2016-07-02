package command_midterm;

public interface Command {
	public boolean Execute(Info info);
	public void Undo(Info info);
}
