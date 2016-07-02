package strategy_pattern;

import java.util.List;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalPassengers = flights.stream().mapToInt(x -> x.passengersCount).sum();
		long businessClassRev = (long) (0.33 * totalPassengers * (1.5 * Model.basePrice));
		long coachClassRev = (long) (0.66 * totalPassengers * (0.75 * Model.basePrice));
		return (long) (businessClassRev + coachClassRev - (1.1 * Model.fixCost));
	}

}
