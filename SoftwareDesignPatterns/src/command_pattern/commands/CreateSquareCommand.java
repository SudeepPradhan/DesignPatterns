package command_pattern.commands;

import command_pattern.Command;
import command_pattern.DrawingScreen;

public class CreateSquareCommand implements Command {
    
	private DrawingScreen screen;
    
    public CreateSquareCommand(DrawingScreen screen)
    {
    	this.screen = screen;
    }
    
    public void execute(int size) {
    	this.screen.CreateSquare(size);
    }

	@Override
	public void undo(int value) {
		this.screen.DeleteSquare();
	}
}
