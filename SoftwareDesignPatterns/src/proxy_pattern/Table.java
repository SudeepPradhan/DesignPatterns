package proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements ITable {
	private List<IRow> rows = new ArrayList<IRow>();
	
	@Override
	public int numOfRows() {
		return rows.size();
	}

	@Override
	public IRow getRow(int rowNum) {
		return rows.get(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {	
		rows.add(rowNum, row);
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		rows.set(rowNum, row);
	}

	@Override
	public void deleteRow(int rowNum) {
		rows.remove(rowNum);
	}
}
