package factorymethod_pattern;

public interface TraceFactory {
	public Trace createTrace(TraceType type);
}
