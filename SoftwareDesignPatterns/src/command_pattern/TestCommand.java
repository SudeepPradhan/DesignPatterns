package command_pattern;

import command_pattern.commands.*;

public class TestCommand {
    public static void main(String[] args) {
    	
        DrawingScreen screen = new DrawingScreen();
        Controller controller = new Controller();
        
        CreateSquareCommand createSquare = new CreateSquareCommand(screen);
        controller.executeCommand(createSquare, 5);
        
        ScaleSquareCommand scaleSquare = new ScaleSquareCommand(screen);
        controller.executeCommand(scaleSquare, 2);
        
        MoveLeftSquareCommand moveLeftSquare = new MoveLeftSquareCommand(screen);
        controller.executeCommand(moveLeftSquare, 2);
        controller.undo();
        
        MoveRightSquareCommand moveRightSquare = new MoveRightSquareCommand(screen);
        controller.executeCommand(moveRightSquare, 3);
    }
} 
