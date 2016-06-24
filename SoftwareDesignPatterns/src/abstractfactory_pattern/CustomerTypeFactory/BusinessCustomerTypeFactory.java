package abstractfactory_pattern.CustomerTypeFactory;

import abstractfactory_pattern.interfaces.Bag;
import abstractfactory_pattern.interfaces.Box;
import abstractfactory_pattern.interfaces.CustomerTypeFactory;
import abstractfactory_pattern.interfaces.Wrap;
import abstractfactory_pattern.packageType.HardPlastic;
import abstractfactory_pattern.packageType.HolidaySurprise;
import abstractfactory_pattern.packageType.MerchantCollection;

public class BusinessCustomerTypeFactory implements CustomerTypeFactory {

	@Override
	public Bag createBag() {
		// TODO Auto-generated method stub
		return new MerchantCollection();
	}

	@Override
	public Box createBox() {
		// TODO Auto-generated method stub
		return new HardPlastic();
	}

	@Override
	public Wrap createWrap() {
		// TODO Auto-generated method stub
		return new HolidaySurprise();
	}

}
