package visitor1_pattern;

import java.util.ArrayList;
import java.util.List;

public class Node extends Composite {
	private Side side;
	private String name;
	private List<Composite> nodes;

	public Node(String name) {
		this.name = name;
		nodes = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	@Override
	public void setSide(Side side) {
		this.side = side;
		for (Composite composite : nodes) {
			composite.setSide(side);
		}
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);

	}

	@Override
	public void addNode(Composite composite) {
		nodes.add(composite);

	}

	public Side getSide() {
		return side;
	}

	public List<Composite> getNodes() {
		return nodes;
	}

}
