package flyweight_pattern;

public interface CustomerFlyweight {

	public void customerInfo(String cutomerId, String firstName, String lastName, 
			Address address, HealthProfile healthProfile, Image image);
}
