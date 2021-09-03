package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import java.util.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int turn = 0;
		int[][] array = {{1, 1}, {4, 1}};
		int[][] array2 = {{5, 1}, {5, 3}};
		Ship s = new Ship(4, array, 1);
		Ship s2 = new Ship(3, array2, 2);
		Ship[] ArrayShips = {s};
		Ship[] ArrayShips2 = {s2};
		int row = 0, col = 0, commaIndex = 0;
		Player p1 = new Player(ArrayShips);
		Player p2 = new Player(ArrayShips2);
		Game g = new Game(p1, p2);
		g.p1Board.addShipToBoard(s);
		g.p2Board.addShipToBoard(s2);
		Scanner in = new Scanner(System.in);
		boolean hitShip = false;
		while (true) {
			int c = turn + 1;
			if (!hitShip)
				System.out.println("It's player " + c + "'s turn.");
			hitShip = false;
			
			
			System.out.println("Opponent's board:");
			if (turn == 0) {
				g.p2BombBoard.printBoard();
			} else {
				g.p1BombBoard.printBoard();
			}
			System.out.println("Enter row,col (1,10): ");
			
			while (true) {
				try {
					String input = in.nextLine();
					if (input.equals("q"))
						break;
					commaIndex = input.indexOf(",");
					row = Integer.parseInt(input.substring(0, commaIndex)) - 1;
					col = Integer.parseInt(input.substring(commaIndex + 1)) - 1;
					
					// System.out.println(row + "," + col);
					if (!(row < 0 || row > 9 || col < 0 || col > 9)) {
						if (turn == 0 && g.p2Board.getSquare(row, col) != g.p2Board.BOMB)
							break;
						else if (turn == 1 && g.p1Board.getSquare(row, col) != g.p1Board.BOMB)
							break;
						else
							System.out.println("You have already placed a bomb here. Try again: ");
					}
					else {
						System.out.println("Invalid. Try again: ");
					}
				} catch (Exception e) {
					System.out.println("Invalid. Try again: ");
				}
			}
				
			if (turn == 0) {  // if it's P1's turn
				g.p2BombBoard.placeBomb(row, col);
				if (g.p2Board.placeBomb(row, col)) {  // attack P2's board
					System.out.println("Hit ship!");
					hitShip = true;
				}
				g.p2BombBoard.printBoard();
				if (g.getWinner(1) == 1) {
					System.out.println("Player 1 won the game!");
					break;
				}
			} else {
				g.p1BombBoard.placeBomb(row, col);
				if (g.p1Board.placeBomb(row, col)) {
					System.out.println("Hit ship!");
					hitShip = true;
				}
				g.p1BombBoard.printBoard();
				if (g.getWinner(2) == 2) {
					System.out.println("Player 2 won the game!");
					break;
				}
			}
			System.out.println("");
			if (!hitShip) {
				turn ++;
				turn = turn % 2;
				
			} else {
				System.out.println("Place another bomb.");
			}
			
			
			
			
			// g.p2Board.printBoard();
		}
		in.close();
		// launch(args);
	}
}
