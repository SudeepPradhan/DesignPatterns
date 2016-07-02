package strategy_pattern;

import java.util.List;

public class FlightRevenueCalculator {
	private Model model;
	
	public void setModel(Model model)
	{
		this.model = model;
	}
	
	public double CalculateRevenue(List<Flight> flights)
	{
		return this.model.getRevenue(flights);
	}
}
