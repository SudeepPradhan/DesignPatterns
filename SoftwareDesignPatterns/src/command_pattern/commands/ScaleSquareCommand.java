package command_pattern.commands;

import command_pattern.Command;
import command_pattern.DrawingScreen;

public class ScaleSquareCommand implements Command {
	
    private DrawingScreen screen;
    
    public ScaleSquareCommand(DrawingScreen screen)
    {
    	this.screen = screen;
    }
    
    public void execute(int scaleBy) {
    	screen.Scale(scaleBy);
    }

	@Override
	public void undo(int scaleBy) {
		screen.Scale(-scaleBy);
	}
}
