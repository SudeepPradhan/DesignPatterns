package flyweight_pattern;

public class CustomerFactory {

	static ConcreteCustomerFlyweight byCity[] = new ConcreteCustomerFlyweight[6];

	static {
		byCity[0] = new ConcreteCustomerFlyweight(City.Fairfield);
		byCity[1] = new ConcreteCustomerFlyweight(City.IowaCity);
		byCity[2] = new ConcreteCustomerFlyweight(City.MountPlesant);
		byCity[3] = new ConcreteCustomerFlyweight(City.Ottumwa);
	}

	public static ConcreteCustomerFlyweight getCustomer(City city) {
		int i = Math.abs(city.hashCode() % 4);
		ConcreteCustomerFlyweight line = byCity[i];
		return line;
	}

}
