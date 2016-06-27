package builder_pattern;

import builder_pattern.properties.Agent;

public class BuilderClient {
	public static void main(String[] args) {
		Agent agent1 = new Agent("001", null);
		
		Call call = new Call(new CustomerRequestBuilder());
		call.callPop(agent1);
		
		call.BuildRequest();
		
		System.out.println(call.getStatus());
	}
}
