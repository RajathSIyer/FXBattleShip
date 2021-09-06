package application;

public class Game {
	
	public Board p1Board;
	public Board p2Board;
	public Board p1BombBoard;
	public Board p2BombBoard;
	public static int turn;  // 0 => P1's turn, 1 => P's turn
	public Player p1;
	public Player p2;
	
	public Game() {
		Ship[] array = {};
		this.p1 = new Player(array);
		this.p2 = new Player(array);
		p1Board = new Board(this.p1);
		p1BombBoard = new Board(this.p1);  // board that only contains bombs and EMPTY
		p2BombBoard = new Board(this.p2);
		p2Board = new Board(this.p2);
		turn = 0;
	}
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		p1Board = new Board(this.p1);
		p2Board = new Board(this.p2);
		p1BombBoard = new Board(this.p1);  // board that only contains bombs and EMPTY
		p2BombBoard = new Board(this.p2);
		turn = 0;
	}
	
	public int getWinner(int player) {
		/**
		 * <player> is the player who just made a move.
		 * Return 0 if they have not won.
		 * Return <player> if they have won.
		 */
		if (player == 1) {
			for (Ship x: p2.ships) {
				if (x.hp != 0)
					return 0;
			}
			return player;
		} else {
			for (Ship x: p1.ships) {
				if (x.hp != 0)
					return 0;
			}
			return player;
		}
		
	}
	
}

class Board{
	private char[][] board;
	private int size = 10;
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
	
	public boolean placeBomb(int row, int col) { // attack opponets ship
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

class Ship{
	int length;
	int hp;
	int coordinates[][] = new int[2][2];  // start coord + end coord?
	int player;  // 1 or 2
	
	public Ship(int length, int[][] coordinates, int player) {
		this.length = length;
		this.coordinates = coordinates;
		this.hp = length;  // subject to change
		this.player = player;
	}
	
	public void decreaseHp() {
		this.hp -= 1;
	}
	
	public int getHp() {
		return this.hp;
	}
	
}

class Player{
	Ship ships[];
	
	public Player(Ship[] ships) {
		this.ships = ships;
	}
	
	public boolean gameOver() {  // all of this players ships are dead
		for (Ship x: ships) {
			if (x.hp != 0)
				return false;
		}
		return true;
	}
	
	public Ship getShip(int row, int col) {
		/**
		 * Return the ship that is at (row, col).
		 */
		for (Ship x: ships) {
			if (x.coordinates[0][0] <= row && row <= x.coordinates[1][0] && x.coordinates[0][1] <= col && col <= x.coordinates[1][1]) {
				return x;
				}
			}
		return this.ships[0];  // will never be executed
		}
	}
