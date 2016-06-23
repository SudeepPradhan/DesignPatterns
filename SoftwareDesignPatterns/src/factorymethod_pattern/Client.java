package factorymethod_pattern;

public class Client {

	public static Trace trace;
	public static void main(String[] args) 
	{
		Initialize(args);
		
		//Calculation Application
		try
		{
			int a = 2;
			int b = 0;
			
			trace.debug("Value of a: " + a);
			trace.debug("Value of b: " + b);
			
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException exp)
		{
			trace.error("Divide by zero exception");
		}
	}
	
	public static void Initialize(String[] args)
	{
		InitializeTrace(args);
	}
	
	public static void InitializeTrace(String[] args)
	{
		TraceType type = Helper.ParseTraceArguments(args);
		TraceFactory factory = SimpleTraceFactory.getFactory();
		trace = factory.createTrace(type);	
	}
}
