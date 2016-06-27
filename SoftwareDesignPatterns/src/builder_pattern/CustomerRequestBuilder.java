package builder_pattern;

import builder_pattern.interfaces.RequestBuilder;
import builder_pattern.properties.Address;
import builder_pattern.properties.Agent;
import builder_pattern.properties.Customer;

public class CustomerRequestBuilder implements RequestBuilder {

	Request request;
	
	CustomerRequestBuilder()
	{
		this.request = new Request();
	}
	
	@Override
	public void buildSerivceId(String reqId) {
		request.setReqId(reqId);		
	}
	
	@Override
	public void buildCustomer(String firstName, String secondName, Address address, String phone, String email) {
		
		Customer customer;
		
		if(DummyDatabase.isCustomerExists(phone))
		{
			customer = DummyDatabase.getCustomer(phone);
		}
		else
		{
			customer = new Customer(firstName, secondName, null, phone, email);	
		}
		
		this.request.setRequester(customer);	
	}

	@Override
	public void buildAgent(Agent agent) {
		this.request.setAgent(agent);
	}

	@Override
	public void buildRequestContent(String requestContent) {
		this.request.setReqContent(requestContent);
	}

	@Override
	public void buildResponseContent(String responseContent) {
		this.request.setRespContent(responseContent);
	}

	@Override
	public void isAnswered(boolean isAnswered) {
		this.request.setAnswered(isAnswered);
	}

	@Override
	public void isSaleLead(boolean isSaleLead) {
		this.request.setSaleLead(isSaleLead);
	}

	@Override
	public void needCallBack(boolean needCallBack) {
		this.request.setNeedCallBack(needCallBack);		
	}
}
