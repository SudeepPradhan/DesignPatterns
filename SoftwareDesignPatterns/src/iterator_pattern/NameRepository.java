package iterator_pattern;

public class NameRepository implements Aggregate {

	private String names[][] = {{"Rob" , "Jon" ,"Jul" , "Lor", "Pat", "Ken"}, 
			{"Rob2", "Jon2", "-", "Lor2", "Pat2", "-"}};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int rowLen = names.length;
		int columnLen = names[0].length;
		
		int row = 0;
		int column = -1;
		
		public void updateIndex()
		{
			if(column < columnLen - 1)
				column++;
			else if(row < rowLen - 1)
			{
				row++;
				column = 0;
			}
		}
		
		@Override
		public boolean hasNext() {	
			if(row < rowLen - 1)
			{
				return true;
			}
			else if(column < columnLen - 1)
			{
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
			if(this.hasNext()){
				updateIndex();
				String val = names[row][column];
				return val == "-" ? "" : val;
			}
			return null;
		}
	}
}
