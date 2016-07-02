package command_midterm;

public interface BillPayFacadeInterface {
	public Account createPaymentAccount(User user);
	public void removePaymentAccount(Account account);
	public boolean submitCreditCard(CreditCard card);
}
