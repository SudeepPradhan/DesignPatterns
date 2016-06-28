package flyweight_pattern;

public class Client {

	public static void main(String[] args) {
		
		ConcreteCustomerFlyweight concreteCustomer = CustomerFactory.getCustomer(City.IowaCity);
		concreteCustomer.customerInfo("001", "John", "Hagelin", null, null, concreteCustomer.image );
	}
}
