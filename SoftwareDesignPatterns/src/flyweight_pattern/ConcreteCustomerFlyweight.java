package flyweight_pattern;

public class ConcreteCustomerFlyweight implements CustomerFlyweight {
	
	Image image = null; //intrinsic
	
	public ConcreteCustomerFlyweight(City city) {
		image = new Image(city);
	}

	@Override
	public void customerInfo(String cutomerId, String firstName, String lastName,
			Address address, HealthProfile healthPoint, Image image) {
		System.out.println(
				"Cutomer details::cutomerId" + cutomerId + " firstName::" + 
		firstName + " lastName::" + lastName);

	}
}