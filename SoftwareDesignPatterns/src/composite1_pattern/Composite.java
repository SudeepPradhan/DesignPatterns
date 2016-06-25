package composite1_pattern;

public class Composite extends Component 
{
	public Composite(String title) 
	{
		super(title);
	}
	
	@Override
	public void render() 
	{
		for (Component item : list)
		{
			item.render();
		}
	}
}
