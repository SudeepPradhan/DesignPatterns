package command_midterm;

public class DBFacade implements DBFacadeInterface {

	@Override
	public void save(User user) {
		System.out.println("Saved the User in db");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Deleted the User from db");
		
	}

}
