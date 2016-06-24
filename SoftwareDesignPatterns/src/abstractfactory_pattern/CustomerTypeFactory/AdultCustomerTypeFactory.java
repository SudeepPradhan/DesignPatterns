package abstractfactory_pattern.CustomerTypeFactory;

import abstractfactory_pattern.interfaces.Bag;
import abstractfactory_pattern.interfaces.Box;
import abstractfactory_pattern.interfaces.CustomerTypeFactory;
import abstractfactory_pattern.interfaces.Wrap;
import abstractfactory_pattern.packageType.EverydayValue;
import abstractfactory_pattern.packageType.PlainPaper;
import abstractfactory_pattern.packageType.ReusableShopper;

public class AdultCustomerTypeFactory implements CustomerTypeFactory {

	@Override
	public Bag createBag() {
		// TODO Auto-generated method stub
		return new ReusableShopper();
	}

	@Override
	public Box createBox() {
		// TODO Auto-generated method stub
		return new PlainPaper();
	}

	@Override
	public Wrap createWrap() {
		// TODO Auto-generated method stub
		return new EverydayValue();
	}

}
