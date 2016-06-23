package factorymethod_pattern;

public class Helper {
	public static TraceType ParseTraceArguments(String[] args)
	{
		TraceType traceType = TraceType.None;
		if(args.length > 0)
		{
			String traceTypeArg = args[0];
			switch(traceTypeArg.toLowerCase())
			{
				case "/consoletrace": 
					traceType = TraceType.Console;
					break;
				case "/filetrace":
					traceType = TraceType.File;
					break;
				default:
				{
					System.out.println("Parameter error, should be either /consoletrace or /filetrace");
					throw new IllegalArgumentException();
				}
			}
		}
		return traceType;
	}
}
