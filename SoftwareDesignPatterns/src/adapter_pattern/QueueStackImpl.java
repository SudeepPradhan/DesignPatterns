package adapter_pattern;

public class QueueStackImpl implements Queue, Stack{
	private Adaptee adaptee;
	
	QueueStackImpl()
	{
		adaptee = new Adaptee();
	}
	
	@Override
	public void queue(String str) {
		adaptee.add(str);
	}
	
	@Override
	public String dequeue() {
		String str = adaptee.startString();
		adaptee.remove(adaptee.getStart());
		return str;
	}
	
	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public void push(String str) {
		adaptee.add(str);
	}
	
	@Override
	public String pop() {
		String str = adaptee.endString();
		adaptee.remove(adaptee.getEnd());
		return str;
	}
}
