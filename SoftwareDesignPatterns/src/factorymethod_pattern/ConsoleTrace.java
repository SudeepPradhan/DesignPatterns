package factorymethod_pattern;

public class ConsoleTrace implements Trace {

	Boolean state = true;
	
	@Override
	public void setDebug(boolean debug) {
		state = debug;		
	}

	@Override
	public void debug(String message) {
		if(state)
			System.out.println("Debug Message: " + message);
	}

	@Override
	public void error(String message) {
			System.out.println("Error Message: " + message);
	}

}
