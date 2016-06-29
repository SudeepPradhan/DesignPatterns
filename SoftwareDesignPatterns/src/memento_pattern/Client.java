package memento_pattern;

public class Client {
	public static void main(String[] args)
	{
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		Memento memento = careTaker.get(0);
		originator.getStateFromMemento(memento);
		
		originator.setUserInformation("John address Iowa");
		
		Memento memonto = originator.saveStateToMemento();
		careTaker.add(memonto);
		
		// Client update the information so need to revert to last state
		
		memento = careTaker.getLastSavedMemento();
		originator.undoStateToMemento(memento);
	}
}
