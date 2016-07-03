package decorator_pattern.abstractDecorator;

import decorator_pattern.decorator.Profiler;

public abstract class ProfilerDecorator implements Profiler {

	protected Profiler decoratedList;
	public ProfilerDecorator(Profiler decoratedList){
		this.decoratedList = decoratedList;
	}
}
