package visitor_pattern;

public abstract class Visitor {

	private int graceLoanPeriod = 28;
	
	public abstract double visit(Book book);
	public abstract double visit(Magazine magazine);
	public abstract double visit(Media research);
	
	public int getGraceLoanPeriod() {
		return graceLoanPeriod;
	}
}
