package visitor1_pattern;

import java.util.ArrayList;
import java.util.List;

public class Root extends Composite {
	private Side side;
	private String nodeName;
	private List<Composite> leftNodes, rightNodes;

	public Root(String name) {
		this.side = Side.NONE;
		this.nodeName = name;
		leftNodes = new ArrayList<Composite>();
		rightNodes = new ArrayList<Composite>();
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void addNode(Composite composite) {

	}

	@Override
	public void setSide(Side side) {
		this.side = Side.NONE;
	}

	public String getNodeName() {
		return nodeName;
	}

	public List<Composite> getLeftNodes() {
		return leftNodes;
	}

	public List<Composite> getRightNodes() {
		return rightNodes;
	}

	public Side getSide() {
		return side;
	}
	
	public void addLeftNode(Composite node) {
		leftNodes.add(node);
		node.setSide(side);
	}

	public void addRightNode(Composite node) {
		rightNodes.add(node);
	}

}
