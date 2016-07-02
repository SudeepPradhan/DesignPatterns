package command_midterm;

public class BillPayFacade implements BillPayFacadeInterface {

	@Override
	public Account createPaymentAccount(User user) {
		System.out.println("Created new account");
		return new Account("123");
	}

	@Override
	public void removePaymentAccount(Account account) {
		System.out.println("Removed payment account");
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean submitCreditCard(CreditCard card) {
		System.out.println("Submit the credit card");
		return false;
	}

}
