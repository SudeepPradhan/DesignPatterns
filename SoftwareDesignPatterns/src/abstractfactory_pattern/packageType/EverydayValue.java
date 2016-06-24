package abstractfactory_pattern.packageType;

import abstractfactory_pattern.interfaces.Wrap;

public class EverydayValue implements Wrap {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return (float) 0.00;
	}

	@Override
	public String packingSteps() {
		// TODO Auto-generated method stub
		return "To be included...";
	}

}
