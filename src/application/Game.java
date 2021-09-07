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
