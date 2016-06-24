package abstractfactory_pattern.CustomerTypeFactory;

import abstractfactory_pattern.interfaces.Bag;
import abstractfactory_pattern.interfaces.Box;
import abstractfactory_pattern.interfaces.CustomerTypeFactory;
import abstractfactory_pattern.interfaces.Wrap;
import abstractfactory_pattern.packageType.Cartoon;
import abstractfactory_pattern.packageType.HappyKid;
import abstractfactory_pattern.packageType.Micky;

public class KidCustomerTypeFactory implements CustomerTypeFactory {

	@Override
	public Bag createBag() {
		// TODO Auto-generated method stub
		return new Micky();
	}

	@Override
	public Box createBox() {
		// TODO Auto-generated method stub
		return new Cartoon();
	}

	@Override
	public Wrap createWrap() {
		// TODO Auto-generated method stub
		return new HappyKid();
	}

}
