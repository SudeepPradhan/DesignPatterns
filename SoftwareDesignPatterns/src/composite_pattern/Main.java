package composite_pattern;


public class Main {

	public static void main(String[] args) {
		String html="<html><head></head><body><p>Hello World<p/></body></html>";
        Component rootNode = RenderTreeBuilder.build(html);
        
		for (Component component : rootNode.getChildren()) {
			    component.print();
			for (Component comp :component.getChildren()) {
                 comp.print();
			}				
		}

	}

}
