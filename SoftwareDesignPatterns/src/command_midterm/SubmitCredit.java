package command_midterm;

public class SubmitCredit implements Command {

	@Override
	public boolean Execute(Info info) {
		BillPayFacade billPayFacade = new BillPayFacade();
		boolean result = billPayFacade.submitCreditCard(info.creditCard);
	
		return result;
	}

	@Override
	public void Undo(Info info) {
		// Not implemented	
	}

}
