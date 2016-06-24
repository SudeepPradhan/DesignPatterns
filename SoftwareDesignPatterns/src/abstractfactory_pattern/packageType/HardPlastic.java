package abstractfactory_pattern.packageType;

import abstractfactory_pattern.interfaces.Box;

public class HardPlastic implements Box {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return (float) 1.00;
	}

	@Override
	public String packingSteps() {
		// TODO Auto-generated method stub
		return "To be included...";
	}

}
