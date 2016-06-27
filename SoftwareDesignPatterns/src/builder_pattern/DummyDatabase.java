package builder_pattern;

import builder_pattern.properties.Customer;

public class DummyDatabase {
	public static Customer getCustomer(String phone)
	{
		if(phone.equals("123123123"))
			return new Customer("FirstName", "SecondName", null, "123123123", "12312");
		
		return null;
	}
	
	public static boolean isCustomerExists(String phone)
	{
		if(phone.equals("123123123"))
			return true;
		
		return false;
	}
}
