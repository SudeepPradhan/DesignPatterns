package chainofresponsibility_pattern.agents;

import chainofresponsibility_pattern.interfaces.*;

public class ChainBuilder {
	private AbstractAgent handler;

	public ChainBuilder(){
		AbstractAgent validator = new ValidatorAgent();
		AbstractAgent dataWasher = new DataWasherAgent();
		AbstractAgent reporter = new ReporterAgent();
		validator.nextAgent = dataWasher;
		dataWasher.nextAgent = reporter;
		
		setHandler(validator);
	}
	public AbstractAgent getHandler() {
		return handler;
	}
	public void setHandler(AbstractAgent handler) {
		this.handler = handler;
	}
}
