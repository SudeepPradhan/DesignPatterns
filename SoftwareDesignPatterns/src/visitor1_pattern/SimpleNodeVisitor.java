package visitor1_pattern;

import java.util.List;

public class SimpleNodeVisitor implements NodeVisitor {

	private int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0;

	@Override
	public void visit(Root root) {
		System.out.println(root.getNodeName());
		List<Composite> leftNodes = root.getLeftNodes();
		List<Composite> rightNodes = root.getRightNodes();
		System.out.println("Right nodes::");
		for (Composite composite : rightNodes) {
			composite.accept(this);
		}
		printResults();
		System.out.println("Left nodes::");
		for (Composite composite : leftNodes) {
			composite.accept(this);
		}
		printResults();
	}

	@Override
	public void visit(Node node) {
		String name = node.getName();

		if (name.contains("A")) {
			countA++;
		} else if (name.contains("B")) {
			countB++;
		} else if (name.contains("C")) {
			countC++;
		} else if (name.contains("D")) {
			countD++;
		} else if (name.contains("E")) {
			countE++;
		} else if (name.contains("F")) {
			countF++;
		}

		List<Composite> childNodes = node.getNodes();

		for (Composite composite : childNodes) {
			composite.accept(this);
		}
	}

	public void printResults() {
		if (countA > 0) {
			System.out.println(countA + "A nodes");
		}
		if (countB > 0) {
			System.out.println(countB + "B nodes");
		}
		if (countC > 0) {
			System.out.println(countC + "C nodes");
		}
		if (countD > 0) {
			System.out.println(countD + "D nodes");
		}
		if (countE > 0) {
			System.out.println(countE + "E nodes");
		}
		if (countF > 0) {
			System.out.println(countF + "F nodes");
		}
		countA = 0;
		countB = 0;
		countC = 0;
		countD = 0;
		countE = 0;
		countF = 0;
	}

}
