package observer_pattern;

import java.util.ArrayList;

public class ConcreteNotifier implements NotifierSubject {
	ArrayList<String> namesList;
	private UserObserver userObserver;

	public ConcreteNotifier(ArrayList<String> names, UserObserver userObserver) {
		this.namesList = names;
		this.userObserver = userObserver;
	}

	@Override
	public void notifyObservers() {
		userObserver.update(namesList);
	}

	@Override
	public void addName(String name) {
		namesList.add(name);
		notifyObservers();
	}

	@Override
	public void removeName(int index) {
		if (index >= 0) {
			namesList.remove(index);
			notifyObservers();
		}
	}

}
