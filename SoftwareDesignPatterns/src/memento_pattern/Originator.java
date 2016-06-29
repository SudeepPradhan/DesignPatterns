package memento_pattern;

public class Originator {
	private String userInformation;

	public String getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(String userInformation) {
		this.userInformation = userInformation;
	}

	public Memento saveStateToMemento() {
		return new Memento(userInformation);
	}
	
	public void getStateFromMemento(Memento Memento) {
		userInformation = Memento.getState();
	}
	
	public void undoStateToMemento(Memento Memento) {
		// some steps that is unique to undo
		userInformation = Memento.getState();
	}
}
