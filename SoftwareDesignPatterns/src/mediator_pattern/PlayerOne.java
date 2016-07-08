package mediator_pattern;

public class PlayerOne extends Player {

	public PlayerOne(Mediator mediator) {
		super(mediator);
		disk = Disk.BLACK;
	}

	@Override
	public void move(int row, int column) {
		mediator.move(this, row, column);
	}

}
