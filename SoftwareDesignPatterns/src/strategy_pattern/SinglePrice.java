package strategy_pattern;

import java.util.List;

public class SinglePrice implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		return flights.stream().mapToInt(x -> x.passengersCount).sum() * Model.basePrice - Model.fixCost;
	}

}
