package composite_pattern;

import java.util.Collection;

public interface ItreeProvider {

	void addChild(Component child);
	void addParent(Component parent);
	Component getParent();
	Collection<Component> getChildren();
	void print();
}
