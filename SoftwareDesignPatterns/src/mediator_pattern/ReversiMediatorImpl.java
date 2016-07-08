package mediator_pattern;

public class ReversiMediatorImpl implements Mediator {
	public Board board;
	public Player currentPlayer;

	public ReversiMediatorImpl() {
		board = new Board();
	}

	@Override
	public Board getBoard() {
		return board;
	}

	@Override
	public void move(Player player, int row, int column) {
		if (isValidMove(player, row, column)) 
		{
			board.setCellValue(row, column, player.getDisk());
			currentPlayer = player;
			
			if (isGameOver()) {
				System.out.println("Finish Game");
			}
		}
	}

	@Override
	public boolean isValidMove(Player player, int row, int column) {
		return true; 
	}

	@Override
	public boolean isGameOver() {
		return false;
	}
}
