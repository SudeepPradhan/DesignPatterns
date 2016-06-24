package abstractfactory_pattern.packageType;

import abstractfactory_pattern.interfaces.Wrap;

public class HappyKid implements Wrap {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return (float) 0.10;
	}

	@Override
	public String packingSteps() {
		// TODO Auto-generated method stub
		return "To be included...";
	}

}
