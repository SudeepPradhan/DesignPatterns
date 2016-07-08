package mediator_pattern;

public class PlayerTwo extends Player {

	public PlayerTwo(Mediator mediator) {
		super(mediator);
		disk = Disk.WHITE;
	}

	@Override
	public void move(int row, int column) {
		mediator.move(this, row, column);
	}

}
