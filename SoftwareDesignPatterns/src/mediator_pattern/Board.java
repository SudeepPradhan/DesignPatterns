package mediator_pattern;

public class Board {
	public static int ROW = 8;
	public static int COLUMN = 8;
	public Disk[][] cells;

	public Board() {
		initializeBoard();
	}

	public void setCellValue(int rowNum, int columnNum, Disk value) {
		cells[rowNum][columnNum] = value;
	}

	public Disk getCellValue(int rowNum, int columnNum) {
		return cells[rowNum][columnNum];
	}

	private void initializeBoard() {
		cells = new Disk[ROW][COLUMN];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				cells[i][j] = Disk.NONE;
			}
		}

		cells[3][3] = Disk.BLACK;
		cells[3][4] = Disk.WHITE;
		cells[4][3] = Disk.WHITE;
		cells[4][4] = Disk.BLACK;
	}

}