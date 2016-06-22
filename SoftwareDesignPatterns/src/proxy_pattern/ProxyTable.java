package proxy_pattern;

public class ProxyTable implements ITable {

	Table table = new Table();
	
	@Override
	public int numOfRows() {
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		return table.getRow(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		synchronized(row)
		{
			table.addRow(row, rowNum);
		}
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		synchronized(getRow(rowNum))
		{
			table.modifyRow(rowNum, row);
		}
	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized(ProxyTable.class)
		{
			table.deleteRow(rowNum);
		}
	}
	
}
