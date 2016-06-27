package command_pattern;

class Controller {
	
    private Command createCommand, scaleCommand, moveRightCommand, moveLeftCommand;
    private Command lastCommand;
    private int lastCommandValue;
       
    void executeCommand(Command command, int value)
    {
    	command.execute(value);
    	this.lastCommand = command;
    	this.lastCommandValue = value;
    }
    
    void undo()
    {
    	System.out.println("<Undo>");
    	this.lastCommand.undo(this.lastCommandValue);
    }
    
    void createSquare(int size) {
    	this.createCommand.execute(size);
    }
    
    void scaleSquare(int size) {
    	this.scaleCommand.execute(size);
    }
    
    void moveRightSquare(int size) {
    	this.moveRightCommand.execute(size);
    }
    
    void moveLeftSquare(int size) {
    	this.moveLeftCommand.execute(size);
    }
}
