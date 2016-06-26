package chainofresponsibility_pattern.interfaces;

import chainofresponsibility_pattern.CallRecord;

public abstract class AbstractAgent {
	public AbstractAgent nextAgent;
	abstract public void handleRequest(CallRecord req);
}
