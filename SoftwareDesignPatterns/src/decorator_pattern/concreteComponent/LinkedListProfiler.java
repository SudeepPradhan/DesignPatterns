package decorator_pattern.concreteComponent;

import java.util.LinkedList;

import decorator_pattern.decorator.Profiler;

public class LinkedListProfiler implements Profiler {
	private LinkedList<Object> objects;
	public LinkedListProfiler(){
		this.objects = new LinkedList<Object>();
	}

	@Override
	public boolean add(Object e) {
		Sleep();
		return objects.add(e);
	}

	@Override
	public boolean remove(Object o) {
		Sleep();
		return objects.remove(o);
	}

	@Override
	public boolean contains(Object o) {
		Sleep();
		return objects.contains(0);
	}

	@Override
	public int size() {
		Sleep();
		return objects.size();
	}

	public void Sleep()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
