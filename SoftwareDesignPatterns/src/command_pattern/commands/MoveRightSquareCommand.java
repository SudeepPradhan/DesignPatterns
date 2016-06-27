package command_pattern.commands;

import command_pattern.Command;
import command_pattern.DrawingScreen;

public class MoveRightSquareCommand implements Command {
	
    private DrawingScreen screen;
    
    public MoveRightSquareCommand(DrawingScreen screen)
    {
    	this.screen = screen;
    }
    
    public void execute(int moveBy) {
    	screen.MoveRight(moveBy);
    }

	@Override
	public void undo(int moveBy) {
    	screen.MoveLeft(moveBy);
	}
}
