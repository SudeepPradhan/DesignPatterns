package strategy_pattern;

import java.util.List;

public interface Model {
	public static long basePrice = 300;
	public static long fixCost = 50000;
	
	public long getRevenue(List<Flight> flights);
}
