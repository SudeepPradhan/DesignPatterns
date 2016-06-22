package proxy_pattern;

public class Client {
	public static void main(String[] args)
	{
		ITable table = new ProxyTable();
		IRow row1 = new Row();
		table.addRow(row1, 0);
		
		IRow row2 = table.getRow(0);
		
		System.out.println(row2.getName());
		
		IRow row3 = new Row();
		table.modifyRow(0, row3);
		
		System.out.println("Number of rows:" + table.numOfRows());
		
		table.deleteRow(0);
		
		System.out.println("Number of rows:" + table.numOfRows());
	}
}
