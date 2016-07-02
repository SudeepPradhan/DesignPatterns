package command_midterm;

public class CreatePayment implements Command {

	@Override
	public boolean Execute(Info info) {
		BillPayFacade billPayFacade = new BillPayFacade();
		Account account = billPayFacade.createPaymentAccount(info.user);
		info.account = account;
		
		return true;
	}

	@Override
	public void Undo(Info info) {
		BillPayFacade billPayFacade = new BillPayFacade();
		billPayFacade.removePaymentAccount(info.account);		
	}

}
