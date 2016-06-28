package flyweight_pattern;


public class UnsharedCustomer implements CustomerFlyweight{
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	private Image locationMap; //intrinsic data
	
	public UnsharedCustomer(City city,String lastName){
		locationMap = new Image(city);
		this.lastName = lastName;
	}

	@Override
	public void customerInfo(String cutomerId, String firstName, String lastName, 
			Address address, HealthProfile healthPoint, Image image) {
		System.out.println("Cutomer details::cutomerId"+cutomerId+" firstName::"+firstName+" lastName::"+lastName);
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public HealthProfile getProfile() {
		return profile;
	}

	public void setProfile(HealthProfile profile) {
		this.profile = profile;
	}

	public Image getLocationMap() {
		return locationMap;
	}

	public void setLocationMap(Image locationMap) {
		this.locationMap = locationMap;
	} 
	
	
}
