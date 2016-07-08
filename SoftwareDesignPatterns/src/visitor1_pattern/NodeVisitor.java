package visitor1_pattern;

public interface NodeVisitor {
	public void visit(Root root);

	public void visit(Node node);
}
