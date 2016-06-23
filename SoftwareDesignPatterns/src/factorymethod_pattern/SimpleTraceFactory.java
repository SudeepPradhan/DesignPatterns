package factorymethod_pattern;

public class SimpleTraceFactory implements TraceFactory  
{
	//This factory should often times be a Singleton
	private static TraceFactory factory = new SimpleTraceFactory();
	private SimpleTraceFactory(){}
	
	public static TraceFactory getFactory()
	{ 
		return factory;
	}
	
	@Override
	public Trace createTrace(TraceType type) 
	{
		if (type == TraceType.Console) 
		{
			return new ConsoleTrace();
		} 
		else if (type == TraceType.File) 
		{
			return new FileTrace();
		} 
		else if (type == TraceType.None)
		{
			return new NoTrace();
		}
		
		return null;
	}
}
