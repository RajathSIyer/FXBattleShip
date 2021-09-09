package application.src;

public class Board{
	private char[][] board;
	public static int size = 8;
	private final char EMPTY = 'O';
	private final char SHIP = 'X';
	public final char BOMB = 'B';
	private Player player;  // the player this Board belongs to
	
	public Board(Player player) {
		this.board = new char[size][size];
		this.player = player;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.board[i][j] = EMPTY;
			}
		}
	}
	
	public void printBoard() {
		for (int row = 0; row < size; row ++) {
			for (int col = 0; col < size; col++) {
				System.out.print(this.board[row][col]);
			}
			System.out.println("");
		}
	}
	
	public char getSquare(int row, int col) {
		return this.board[row][col];
	}
	
	public void addShipToBoard(Ship ship) {
		// horizontal ship
		if(ship.coordinates[0][0] == ship.coordinates[1][0]) {
			int row = ship.coordinates[0][0];
			int startingCol = ship.coordinates[0][1];
			int endingCol = ship.coordinates[1][1];
			for (int col = startingCol; col <= endingCol; col++) {
				this.board[row][col] = SHIP;
			}
		} else {
			// vertical ship
			int col = ship.coordinates[1][1];
			int startingRow = ship.coordinates[0][0];
			int endingRow = ship.coordinates[1][0];
			for (int row = startingRow; row <= endingRow; row++) {
				this.board[row][col] = SHIP;
			}
		}
	}
	
	public boolean placeBomb(int row, int col) { // attack opponents ship
		/**
		 * Return True iff ship was hit.
		 */
		if (this.board[row][col] == SHIP) {
			this.board[row][col] = BOMB;
			Ship ship = player.getShip(row, col);
			ship.decreaseHp();
			if (ship.getHp() == 0) {
				System.out.println("Destroyed Ship");
			}
			return true;
		} else {
			this.board[row][col] = BOMB;
			return false;
		}
	}
	
	public void removeShip() {
		
	}

}
