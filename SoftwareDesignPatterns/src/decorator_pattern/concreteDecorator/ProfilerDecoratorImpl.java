package decorator_pattern.concreteDecorator;

import decorator_pattern.abstractDecorator.ProfilerDecorator;
import decorator_pattern.decorator.Profiler;

public class ProfilerDecoratorImpl extends ProfilerDecorator {
	
	public ProfilerDecoratorImpl(Profiler decoratedList) {
		super(decoratedList);
	}

	@Override
	public boolean add(Object e){	 
		long startTime = System.currentTimeMillis();  		
		boolean isTrue = decoratedList.add(e);
		long currentTime = System.currentTimeMillis();
		System.out.println("Added: '" + e.toString() + "' > Profile time : " + (currentTime - startTime) + "ms");		
		return isTrue;
	}
	  
	@Override
	public boolean contains(Object e){	  
		long startTime = System.currentTimeMillis();
		boolean isTrue = decoratedList.contains(e);
		long currentTime = System.currentTimeMillis();
		System.out.println("Contains: '" + e.toString() + "' " + isTrue + " > Profile time : " + (currentTime - startTime) + "ms");
		return isTrue; 
	}
	  
	@Override
	public boolean remove(Object e){ 
		long startTime = System.currentTimeMillis();
		boolean isTrue = decoratedList.remove(e);
		long currentTime = System.currentTimeMillis();
		System.out.println("Remove: '" + e.toString() + "' > Profile time : " + (currentTime - startTime) + "ms");
		return isTrue;	  
	}
	  
	@Override
	public int size(){  
		long startTime = System.currentTimeMillis();
		int size = decoratedList.size();
		long currentTime = System.currentTimeMillis();
		System.out.println("Size: " + size + " > Profile time : " + (currentTime - startTime) + "ms");
		return size;
	}
}
