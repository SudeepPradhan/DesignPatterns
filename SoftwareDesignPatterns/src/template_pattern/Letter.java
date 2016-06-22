package template_pattern;

public class Letter implements ILetter {

	int row = 0;
	int maxRow = 0;
	int column = 0;
	int maxColumn = 0;
	String[] letters;
	
	Letter(String[] letterArr, int row, int column, int maxRow, int maxColumn)
	{
		this.letters = letterArr;
		this.row = row;
		this.column = column;
		this.maxRow = maxRow;
		this.maxColumn = maxColumn;
	}
	
	@Override
	public void setRow(int size) {
		row = size;
	}

	@Override
	public void setColumn(int size) {
		column = size;
	}

	@Override
	public void setMaxRow(int size) {
		maxRow = size;
	}

	@Override
	public void setMaxColumn(int size) {
		maxColumn = size;
	}

	@Override
	public String[] getPartialLetter() {
		return letters;
	}

	@Override
	public int getRow() {
		return this.row;
	}

	@Override
	public int getColumn() {
		return this.column;
	}

	@Override
	public int getMaxRow() {
		return this.maxRow;
	}

	@Override
	public int getMaxColumn() {
		return this.maxColumn;
	}
}
