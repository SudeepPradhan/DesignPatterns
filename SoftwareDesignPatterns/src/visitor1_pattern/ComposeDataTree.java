package visitor1_pattern;

public class ComposeDataTree {

	public static Root getRoot() {

		Composite nodeA = new Node("A");
		Composite nodeA1 = new Node("A1");
		Composite nodeA2 = new Node("A2");
		Composite nodeAA1 = new Node("AA1");
		Composite nodeAA2 = new Node("AA2");
		Composite nodeAA3 = new Node("AA3");

		Composite nodeB1 = new Node("B1");
		Composite nodeB2 = new Node("B2");
		Composite nodeB = new Node("B");

		Composite nodeC = new Node("C");
		Composite nodeC1 = new Node("C1");
		Composite nodeC2 = new Node("C2");

		Composite nodeD = new Node("D");
		Composite nodeD1 = new Node("D1");
		Composite nodeD2 = new Node("D2");

		Composite nodeE = new Node("E");
		Composite nodeE1 = new Node("E1");
		Composite nodeE2 = new Node("E2");

		Composite nodeF = new Node("F");
		Composite nodeF1 = new Node("F1");
		Composite nodeF2 = new Node("F2");

		nodeA1.addNode(nodeAA1);
		nodeA1.addNode(nodeAA2);
		nodeA1.addNode(nodeAA3);

		nodeA.addNode(nodeA1);
		nodeA.addNode(nodeA2);

		nodeB.addNode(nodeB1);
		nodeB.addNode(nodeB2);

		nodeC.addNode(nodeC1);
		nodeC.addNode(nodeC2);

		nodeD.addNode(nodeD1);
		nodeD.addNode(nodeD2);

		nodeE.addNode(nodeE1);
		nodeE.addNode(nodeE2);

		nodeF.addNode(nodeF1);
		nodeF.addNode(nodeF2);

		Root root = new Root("Topic");
		root.addRightNode(nodeA);
		root.addRightNode(nodeB);
		root.addRightNode(nodeC);

		root.addLeftNode(nodeD);
		root.addLeftNode(nodeE);
		root.addLeftNode(nodeF);

		return root;
	}

}
