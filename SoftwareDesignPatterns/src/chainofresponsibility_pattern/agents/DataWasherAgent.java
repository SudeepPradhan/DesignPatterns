package chainofresponsibility_pattern.agents;

import chainofresponsibility_pattern.CallRecord;
import chainofresponsibility_pattern.interfaces.*;

public class DataWasherAgent extends AbstractAgent{
	
	@Override
	public void handleRequest(CallRecord req) {
		
		req.setASalesLead(true);
		
		if (this.nextAgent != null)
			this.nextAgent.handleRequest(req);
	}
}
