package strategy_pattern;

import java.util.List;

public class MultiClass implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalPassengers = flights.stream().mapToInt(x -> x.passengersCount).sum();
		long firstClassRev = (long) ((0.1 * totalPassengers) * (4 * Model.basePrice));
		long businessClassRev = (long) ((0.2 * totalPassengers) * (1.5 * Model.basePrice));
		long coachClassRev = (long) ((0.7 * totalPassengers) * (0.75 * Model.basePrice));
		return (long) (firstClassRev + businessClassRev + coachClassRev - (1.2 * Model.fixCost));
	}

}
