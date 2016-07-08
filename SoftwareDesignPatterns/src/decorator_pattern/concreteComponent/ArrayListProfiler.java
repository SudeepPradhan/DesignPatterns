package decorator_pattern.concreteComponent;

import java.util.ArrayList;

import decorator_pattern.decorator.Profiler;


public class ArrayListProfiler implements Profiler {

	private ArrayList<Object> objects;
	public ArrayListProfiler(){
		this.objects = new ArrayList<Object>();
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
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
