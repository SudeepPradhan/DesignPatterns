package composite1_pattern;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component 
{
	protected Collection<Component> list = new ArrayList<Component>();
	protected String title;
	
	public abstract void render();
	
	Component(String title)
	{
		this.title = title;
	}
	
	public void addItem(Component item)
	{
		list.add(item);
	}
}
