package command_midterm;

public class CreateUser implements Command {

	@Override
	public boolean Execute(Info info) {
		DBFacade facade = new DBFacade();
		facade.save(info.user);
		
		return true;
	}

	@Override
	public void Undo(Info info) {
		DBFacade facade = new DBFacade();
		facade.remove(info.user);
	}
	
}
