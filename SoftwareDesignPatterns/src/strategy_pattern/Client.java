package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		FlightRevenueCalculator calculator = new FlightRevenueCalculator();
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight(500));
		flights.add(new Flight(500));
		
		calculator.setModel(new SinglePrice());
		double singlePriceRev = calculator.CalculateRevenue(flights);
		System.out.println("Single Price Revenue: $" + singlePriceRev);
		
		calculator.setModel(new TwoClasses());
		double twoClassesRev = calculator.CalculateRevenue(flights);
		System.out.println("Two Classes Revenue: $" + twoClassesRev);
				
		calculator.setModel(new MultiClass());
		double multipClassRev = calculator.CalculateRevenue(flights);
		System.out.println("Multi Class Revenue: $" + multipClassRev);
	}

}
