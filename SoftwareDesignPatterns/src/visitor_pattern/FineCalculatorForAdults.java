package visitor_pattern;

public class FineCalculatorForAdults extends Visitor {
	
	private double maxFine = 10;
			
	public FineCalculatorForAdults() {
	}

	@Override
	public double visit(Book book) {
		System.out.print("Book fine calculator :");

		int loanDays = 0;
		if(book.getLoanPeriod() > getGraceLoanPeriod())
			loanDays = book.getLoanPeriod() - getGraceLoanPeriod();
		else
			return 0;
		
		
		double fine = loanDays * .10;
		if (fine > maxFine) {
			fine = maxFine;
		}
		return fine;
	}

	@Override
	public double visit(Magazine magazine) {
		System.out.print("Magazine fine Calculator :");
		
		int loanDays = 0;
		if(magazine.getLoanPeriod() > getGraceLoanPeriod())
			loanDays = magazine.getLoanPeriod() - getGraceLoanPeriod();
		else
			return 0;
			
		
		double fine = loanDays * .15;
		
		if (fine > maxFine) {
			fine = maxFine;
		}
		return fine;
	}

	@Override
	public double visit(Media media) {
		System.out.print("Research fine Calculator :");
		
		int loanDays = 0;
		if(media.getLoanPeriod() > getGraceLoanPeriod())
			loanDays = media.getLoanPeriod() - getGraceLoanPeriod();
		else
			return 0;
		
		
		double fine = loanDays * .20;
		
		if (fine > maxFine) {
			fine = maxFine;
		}
		return fine;
	}
}
