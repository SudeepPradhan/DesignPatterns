package visitor_pattern;

public class Book implements LibraryItems{
	private String name;
	private int loanPeriod;
	
	public Book(String name,int loanPeriod){
		this.name=name;
		this.loanPeriod=loanPeriod;
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getLoanPeriod() {
		return loanPeriod;
	}

}
