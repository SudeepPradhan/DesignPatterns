package adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class Adaptee {
	private List<String> data = new ArrayList<String>();
	private int start = 0;
	private int end = -1;

	public String startString(){
		return data.get(start);
	}

	public String endString(){
		return data.get(end);
	}

	public boolean empty(){
		return ( end == -1 );
	}

	public void add(String str){
		data.add(str);
		end++;
	}

	public void remove(int pos){
		for ( int i = pos; i < end; i++ ){
			data.set(i, data.get(i + 1));
		}
		end--;
	}
	public String get(int pos){
		return data.get(pos);
	}
	
	public int getStart()
	{
		return start;
	}
	
	public int getEnd()
	{
		return end;
	}
}
