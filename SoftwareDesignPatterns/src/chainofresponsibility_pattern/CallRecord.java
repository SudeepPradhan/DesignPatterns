package chainofresponsibility_pattern;

import chainofresponsibility_pattern.properties.Agent;
import chainofresponsibility_pattern.properties.Customer;

public class CallRecord {
	private String callRecordId;
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isASalesLead;
	
	public CallRecord(String callRecordId, Customer customer, Agent agent, String reqInfo)
	{
		this.callRecordId = callRecordId;
		this.customer = customer;
		this.agent = agent;
		this.requestInformation = reqInfo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public String getRequestInformation() {
		return requestInformation;
	}
	public void setRequestInformation(String requestInformation) {
		this.requestInformation = requestInformation;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public boolean isASalesLead() {
		return isASalesLead;
	}
	public void setASalesLead(boolean isASalesLead) {
		this.isASalesLead = isASalesLead;
	}
	
	boolean canHandleRequest = false;
	public void setAnswered(boolean handleRequest) {
		this.canHandleRequest = handleRequest;
	}
	public String getCallRecordId() {
		return callRecordId;
	}
	public void setCallRecordId(String callRecordId) {
		this.callRecordId = callRecordId;
	}
}
