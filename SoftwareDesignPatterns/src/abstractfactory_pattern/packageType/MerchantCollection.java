package abstractfactory_pattern.packageType;

import abstractfactory_pattern.interfaces.Bag;

public class MerchantCollection implements Bag {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return (float) 0.50;
	}

	@Override
	public String packingSteps() {
		// TODO Auto-generated method stub
		return "To be included...";
	}

}
