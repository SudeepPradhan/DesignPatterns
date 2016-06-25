package composite1_pattern;

public class Leaf extends Component {
	private String text;
	
	public Leaf(String title, String text) 
	{
		super(title);
		this.text = text;
	}

	public void addItem(Component item)
	{
		System.out.println("Can't do it!");
	}
	
	@Override
	public void render() {
		System.out.println("Rendering -- Leaf [text=" + text + ", title=" + title + "]");
	}
}
