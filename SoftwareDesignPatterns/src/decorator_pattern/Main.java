package decorator_pattern;

import decorator_pattern.concreteComponent.ArrayListProfiler;
import decorator_pattern.concreteComponent.LinkedListProfiler;
import decorator_pattern.concreteDecorator.ProfilerDecoratorImpl;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Profiling ArrayList");
		ProfilerDecoratorImpl arrayListProfiler = new ProfilerDecoratorImpl(new ArrayListProfiler());
		arrayListProfiler.add("Test");
		arrayListProfiler.contains("Test");
		arrayListProfiler.size();
		arrayListProfiler.remove("Test");
		arrayListProfiler.size();
		
		System.out.println("Profiling LinkedList");
		ProfilerDecoratorImpl linkedListProfiler = new ProfilerDecoratorImpl(new LinkedListProfiler());
		linkedListProfiler.add("Test");
		linkedListProfiler.contains("Test");
		linkedListProfiler.size();
		linkedListProfiler.remove("Test");
		linkedListProfiler.size();
	}
}
