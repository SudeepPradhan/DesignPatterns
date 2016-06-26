package chainofresponsibility_pattern;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibility_pattern.properties.Address;
import chainofresponsibility_pattern.properties.Agent;
import chainofresponsibility_pattern.properties.Customer;

public class DummyDatabase {

	public static List<CallRecord> records = new ArrayList<CallRecord>();
	
	public static List<CallRecord> getCallRecords()
	{
		Address agent1Address = new Address("street_ag1", "city_ag1", "state_ag1", "zip_ag1");
		Agent agent1 = new Agent("Agent1", agent1Address);
		
		Address customer1Address = new Address("stree1", "city1", "state1", "zip1");
		Customer customer1 = new Customer("firstName2", "lastName1", customer1Address, "phone1", "email1");
		CallRecord customer1CallRecord = new CallRecord("001", customer1, agent1, "My problem1");
		
		Address customer2Address = new Address("stree2", "city2", "state2", "zip2");
		Customer customer2 = new Customer("firstName2", "lastName2", customer2Address, "phone2", "email2");
		CallRecord customer2CallRecord = new CallRecord("002", customer2, agent1, "My problem2");
		
		//Address customer3Address = new Address("stree3", "city3", "state3", "zip3");
		Customer customer3 = new Customer("firstName3", "lastName3", null, "phone3", "email3");
		CallRecord customer3CallRecord = new CallRecord("003", customer3, agent1, "My problem3");
		
		List<CallRecord> records = new ArrayList<CallRecord>();
		records.add(customer1CallRecord);
		records.add(customer2CallRecord);
		records.add(customer3CallRecord);
		
		return records;
	}
}
