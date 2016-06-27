package command_pattern.commands;

import command_pattern.Command;
import command_pattern.DrawingScreen;

public class MoveLeftSquareCommand implements Command {
    
	private DrawingScreen screen;
    
    public MoveLeftSquareCommand(DrawingScreen screen)
    {
    	this.screen = screen;
    }
    
    public void execute(int moveBy) {
    	screen.MoveLeft(moveBy);
    }

	@Override
	public void undo(int moveBy) {
		screen.MoveRight(moveBy);
	}
}
