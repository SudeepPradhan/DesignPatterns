package observer_pattern;

public interface NotifierSubject {
	public void addName(String name);

	public void removeName(int index);

	public void notifyObservers();
}
