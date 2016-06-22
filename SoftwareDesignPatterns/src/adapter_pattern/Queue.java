package adapter_pattern;

public interface Queue {
	public void queue(String str);
	public String dequeue();
	public boolean isEmpty();
}
