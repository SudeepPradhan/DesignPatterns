package builder_pattern.interfaces;

import builder_pattern.properties.Address;
import builder_pattern.properties.Agent;

public interface RequestBuilder {
	public void buildSerivceId(String serviceId);
	public void buildCustomer(String firstName, String secondName, Address address, String phone, String email); 
	public void buildAgent(Agent agent);
	public void buildRequestContent(String request);
	public void buildResponseContent(String response);
	public void isAnswered(boolean result);
	public void isSaleLead(boolean result);
	public void needCallBack(boolean result);
}