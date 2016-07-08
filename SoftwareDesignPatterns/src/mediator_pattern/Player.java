package mediator_pattern;

public abstract class Player {
	protected Mediator mediator;
	public Disk disk;

	public Player(Mediator mediator) {
		this.mediator = mediator;
	}

	public Disk getDisk() {
		return disk;
	}

	abstract void move(int row, int column);
}
