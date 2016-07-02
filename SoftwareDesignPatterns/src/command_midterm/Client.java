package command_midterm;

public class Client {

	public static void main(String[] args) {
		Info info = new Info(new User("abc"), null, new CreditCard("123"));
		
		CreateAccountManager manager = new CreateAccountManager();
		manager.CreateAccount(info);
	}

}
