package abstractfactory_pattern;

import java.util.ArrayList;
import java.util.List;

import abstractfactory_pattern.CustomerTypeFactory.AdultCustomerTypeFactory;
import abstractfactory_pattern.CustomerTypeFactory.BusinessCustomerTypeFactory;
import abstractfactory_pattern.CustomerTypeFactory.KidCustomerTypeFactory;
import abstractfactory_pattern.interfaces.Bag;
import abstractfactory_pattern.interfaces.Box;
import abstractfactory_pattern.interfaces.CustomerTypeFactory;
import abstractfactory_pattern.interfaces.Wrap;

public class Client {

	public static void main(String[] args) {
		//Given GiftPack
		List<GiftItem> items = new ArrayList<GiftItem>();
		items.add(new GiftItem("012", "Ball", "Paper Ball", "Bag"));
		items.add(new GiftItem("015", "Cat", "Paper Cat", "Box"));
		Address address = new Address("123", "", "Fairfield", "Iowa", "52557");
		GiftPack pack = new GiftPack(address, "kids");
		pack.setGiftItems(items);
		
		//Abstract Factory
		CustomerTypeFactory factory = null;
		switch(pack.getPackType())
		{
			case "adults":
				factory = new AdultCustomerTypeFactory();
				break;
			case "business":
				factory = new BusinessCustomerTypeFactory();
				break;
			case "kids":
				factory = new KidCustomerTypeFactory();
				break;
		}
			
		float totalCost = 0;
		for(GiftItem item: pack.getGiftItems())
		{
			switch(item.getPackagingType())
			{
				case "Bag":
					Bag bag = factory.createBag();
					totalCost += bag.getCost();
					item.setPackaging(bag);
					break;
				case "Box":
					Box box = factory.createBox();
					totalCost += box.getCost();
					item.setPackaging(box);
					break;
				case "Wrap":
					Wrap wrap = factory.createWrap();
					totalCost += wrap.getCost();
					item.setPackaging(wrap);
					break;
			}
		}
		System.out.println("Total packaging cost: " + totalCost);
	}
}
