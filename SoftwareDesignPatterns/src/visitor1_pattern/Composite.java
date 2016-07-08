package visitor1_pattern;

public abstract class Composite implements Component {

	public abstract void addNode(Composite composite);

	public abstract void setSide(Side side);

}
