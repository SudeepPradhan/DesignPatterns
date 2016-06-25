package composite1_pattern;

public class Client 
{
	public static void main(String[] args) 
	{
		Component html = new Composite("html");
		Component head = new Composite("head");
		Component title = new Leaf("title", "Your Title Here");
		//Similar for remaining HTML tags
		
		html.addItem(head);
		head.addItem(title);
	}
}
