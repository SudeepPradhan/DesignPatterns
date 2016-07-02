package command_midterm;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountManager {
	List<Command> commands = new ArrayList<Command>();
	public void CreateAccount(Info info)
	{
		Command createUser = new CreateUser();
		createUser.Execute(info);
		commands.add(createUser);
		
		Command createPayment = new CreatePayment();
		createPayment.Execute(info);
		commands.add(createPayment);
		
		Command submitCredit = new SubmitCredit();
		boolean result = submitCredit.Execute(info);
		
		if(result == false)
		{
			createUser.Undo(info);
			createPayment.Undo(info);
			commands.remove(createUser);
			commands.remove(createPayment);
		}
	}
}
