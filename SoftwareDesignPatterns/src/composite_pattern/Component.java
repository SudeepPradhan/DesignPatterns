package composite_pattern;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component implements ItreeProvider{

	private Collection<Component> tree = new ArrayList<Component>();
	protected String title;
	
	public Component(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
}
