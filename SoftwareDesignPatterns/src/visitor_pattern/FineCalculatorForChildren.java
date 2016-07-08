package visitor_pattern;

public class FineCalculatorForChildren extends Visitor {
	
	private double maxFine = 3;

	public FineCalculatorForChildren() {
	}

	@Override
	public double visit(Book book) {
		System.out.print("Book fine calculator :");

		int loanDays = 0;
		if(book.getLoanPeriod() > getGraceLoanPeriod())
			loanDays = book.getLoanPeriod() - getGraceLoanPeriod();
		else
			return 0;
		
		double fine = loanDays * .05;
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
			loanDays = magazine.getLoanPeriod() - getGraceLoanPeriod() ;
		else
			return 0;
		
		double fine = loanDays * .05;

		if (fine > maxFine) {
			fine = maxFine;
		}
		return fine;
	}

	@Override
	public double visit(Media media) {
		System.out.print("Media fine Calculator :");
		
		int loanDays = 0;
		if(media.getLoanPeriod() > getGraceLoanPeriod())
			loanDays = media.getLoanPeriod() - getGraceLoanPeriod() ;
		else
			return 0;
		
		double fine = loanDays * .05;

		if (fine > maxFine) {
			fine = maxFine;
		}
		return fine;
	}
}
