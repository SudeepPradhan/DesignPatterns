package builder_pattern;

import java.util.Date;

import builder_pattern.interfaces.RequestBuilder;
import builder_pattern.properties.Agent;

public class Call {
	private String requestId;
	private Agent agent;
	private RequestBuilder builder = null;
	private String status = "not started";
	
	Call(RequestBuilder builder)
	{
		this.builder = builder;
	}
	
	public void callPop(Agent agent){
		this.agent = agent;
		this.requestId = "" + (new Date()).getTime();
		this.status = "on call";
	}
	
	public void BuildRequest()
	{
		builder.buildSerivceId(this.requestId);
		builder.buildAgent(agent);
		builder.buildCustomer("FirstName", "SecondName", null, "123123123", "12312");
		builder.buildRequestContent("Computer disk issue when use for over 4 hours.");
		builder.buildResponseContent("Try recovery software from the disk 222 issue HP page.");
		builder.isAnswered(true);
		builder.isSaleLead(true);
		builder.needCallBack(false);
		this.status = "completed";
	}
	
	public String getStatus()
	{
		return this.status;
	}
}
