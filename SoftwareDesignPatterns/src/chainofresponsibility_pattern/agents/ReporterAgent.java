package chainofresponsibility_pattern.agents;

import chainofresponsibility_pattern.CallRecord;
import chainofresponsibility_pattern.interfaces.*;

public class ReporterAgent extends AbstractAgent {
	
	@Override
	public void handleRequest(CallRecord req) {
		
		System.out.println(req.getCustomer().getAddress().getState());
		
		if (this.nextAgent != null)
			this.nextAgent.handleRequest(req);
	}
}
