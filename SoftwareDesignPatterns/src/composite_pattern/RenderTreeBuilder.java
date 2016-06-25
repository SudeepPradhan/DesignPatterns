package composite_pattern;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenderTreeBuilder {
	
public static Component build(String html){
	Component rootNode = null;
	Pattern p = Pattern.compile("<.*?>");
	Matcher m = p.matcher(html);
	Stack<Component> stack = new Stack();
	while (m.find()) {
        String tag = m.group();
        tag= tag.replace('<', ' ').replace('>', ' ').replace('/', ' ').trim();            
        Component node = new Node(tag);
        if(stack.isEmpty()) {
        	 stack.push(node);		
        }else if(!stack.peek().title.equalsIgnoreCase(tag)){
        	Component parent =  stack.peek();
        	  stack.push(node);
        	  node.addParent(parent);
        	  parent.addChild(node);	
        }else{     
        rootNode=stack.pop();
        }
	}	
	return rootNode;
}

}
