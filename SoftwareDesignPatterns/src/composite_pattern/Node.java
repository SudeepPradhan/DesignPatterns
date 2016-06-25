package composite_pattern;

import java.util.ArrayList;
import java.util.Collection;

public class Node extends Component{

	private Component parent;
	private Collection<Component> children= new ArrayList<Component>();
	
	public Node(String title){
		super(title);
	}
	
	@Override
	public void addChild(Component child) {
		if(children==null) children= new ArrayList<Component>();
		
		children.add(child);
		
	}
	@Override
	public void addParent(Component parent) {
		this.parent = parent;
		
	}

	@Override
	public Component getParent() {
		return this.parent;
	}

	@Override
	public Collection<Component> getChildren() {
		return this.children;
	}

	@Override
	public void print() {
		System.out.println("this node::"+getTitle());
		if(this.parent!=null){
			System.out.println("parent::"+this.parent.getTitle());
		}else{
			System.out.println("parent::Null");
		}
		System.out.println("children::");
		for (Component component : children) {
			
			System.out.println(component.getTitle());
		}
		
	}
	
	
	
}
