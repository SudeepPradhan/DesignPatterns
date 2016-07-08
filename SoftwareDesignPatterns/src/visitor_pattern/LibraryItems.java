package visitor_pattern;

public interface LibraryItems {
	
	public double accept(Visitor visitor);
	public String getName();
	public int getLoanPeriod();
}
