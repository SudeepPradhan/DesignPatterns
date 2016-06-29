package memento_pattern;

class Memento { 
	
	private String state;
	
	public Memento(String state) { 
		this.state = state;
	}
	
	String getState() { 
		return state;
	}
}
