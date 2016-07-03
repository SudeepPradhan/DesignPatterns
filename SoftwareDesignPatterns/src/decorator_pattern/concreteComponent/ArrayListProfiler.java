package decorator_pattern.concreteComponent;

import java.util.ArrayList;

import decorator_pattern.decorator.Profiler;


public class ArrayListProfiler implements Profiler {

	private ArrayList<Object> decorator;
	public ArrayListProfiler(){
		this.decorator = new ArrayList<Object>();
	}

	@Override
	public boolean add(Object e) {
		Sleep();
		return decorator.add(e);
	}

	@Override
	public boolean remove(Object o) {
		Sleep();
		return decorator.remove(o);
	}

	@Override
	public boolean contains(Object o) {
		Sleep();
		return decorator.contains(0);
	}

	@Override
	public int size() {
		Sleep();
		return decorator.size();
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
