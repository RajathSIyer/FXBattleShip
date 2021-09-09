package application.src;

import java.lang.reflect.Array;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController {
	@FXML
	private Button button0;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button button10;
	@FXML
	private Button button11;
	@FXML
	private Button button12;
	@FXML
	private Button button13;
	@FXML
	private Button button14;
	@FXML
	private Button button15;
	@FXML
	private Button button16;
	@FXML
	private Button button17;
	@FXML
	private Button button18;
	@FXML
	private Button button19;
	@FXML
	private Button button20;
	@FXML
	private Button button21;
	@FXML
	private Button button22;
	@FXML
	private Button button23;
	@FXML
	private Button button24;
	@FXML
	private Button button25;
	@FXML
	private Button button26;
	@FXML
	private Button button27;
	@FXML
	private Button button28;
	@FXML
	private Button button29;
	@FXML	
	private Button button30;
	@FXML
	private Button button31;
	@FXML
	private Button button32;
	@FXML
	private Button button33;
	@FXML
	private Button button34;
	@FXML
	private Button button35;
	@FXML
	private Button button36;
	@FXML
	private Button button37;
	@FXML
	private Button button38;
	@FXML
	private Button button39;
	@FXML	
	private Button button40;
	@FXML
	private Button button41;
	@FXML
	private Button button42;
	@FXML
	private Button button43;
	@FXML
	private Button button44;
	@FXML
	private Button button45;
	@FXML
	private Button button46;
	@FXML
	private Button button47;
	@FXML
	private Button button48;
	@FXML
	private Button button49;
	@FXML
	private Button button50;
	@FXML
	private Button button51;
	@FXML
	private Button button52;
	@FXML
	private Button button53;
	@FXML
	private Button button54;
	@FXML
	private Button button55;
	@FXML
	private Button button56;
	@FXML
	private Button button57;
	@FXML
	private Button button58;
	@FXML
	private Button button59;
	@FXML
	private Button button60;
	@FXML
	private Button button61;
	@FXML
	private Button button62;
	@FXML
	private Button button63;
	@FXML
	private Button submitButton;
	@FXML
	private TextArea prompt;
	
	private int placementDecision = 5; // length of ship that is about to be placed
	private int placementTurn = 0;

	Hashtable<Integer,Button> mappingDict = new Hashtable<Integer, Button>();
	

	@FXML
	private void setupAction(ActionEvent e) 
	{
		//START OF "SPAIN"[1:]
		mappingDict.put(0,button0);
		mappingDict.put(1,button1);
		mappingDict.put(2,button2);
		mappingDict.put(3,button3);
		mappingDict.put(4,button4);
		mappingDict.put(5,button5);
		mappingDict.put(6,button6);
		mappingDict.put(7,button7);
		mappingDict.put(8,button8);
		mappingDict.put(9,button9);
		mappingDict.put(10,button10);
		mappingDict.put(11,button11);
		mappingDict.put(12,button12);
		mappingDict.put(13,button13);
		mappingDict.put(14,button14);
		mappingDict.put(15,button15);
		mappingDict.put(16,button16);
		mappingDict.put(17,button17);
		mappingDict.put(18,button18);
		mappingDict.put(19,button19);
		mappingDict.put(20,button20);
		mappingDict.put(21,button21);
		mappingDict.put(22,button22);
		mappingDict.put(23,button23);
		mappingDict.put(24,button24);
		mappingDict.put(25,button25);
		mappingDict.put(26,button26);
		mappingDict.put(27,button27);
		mappingDict.put(28,button28);
		mappingDict.put(29,button29);
		mappingDict.put(30,button30);
		mappingDict.put(31,button31);
		mappingDict.put(32,button32);
		mappingDict.put(33,button33);
		mappingDict.put(34,button34);
		mappingDict.put(35,button35);
		mappingDict.put(36,button36);
		mappingDict.put(37,button37);
		mappingDict.put(38,button38);
		mappingDict.put(39,button39);
		mappingDict.put(40,button40);
		mappingDict.put(41,button41);
		mappingDict.put(42,button42);
		mappingDict.put(43,button43);
		mappingDict.put(44,button44);
		mappingDict.put(45,button45);
		mappingDict.put(46,button46);
		mappingDict.put(47,button47);
		mappingDict.put(48,button48);
		mappingDict.put(49,button49);
		mappingDict.put(50,button50);
		mappingDict.put(51,button51);
		mappingDict.put(52,button52);
		mappingDict.put(53,button53);
		mappingDict.put(54,button54);
		mappingDict.put(55,button55);
		mappingDict.put(56,button56);
		mappingDict.put(57,button57);
		mappingDict.put(58,button58);
		mappingDict.put(59,button59);
		mappingDict.put(60,button60);
		mappingDict.put(61,button61);
		mappingDict.put(62,button62);
		mappingDict.put(63,button63);
		HashMap<int[], Integer> posToNum = generatePosToNumDict();
		//END OF "SPAIN"[1:]
		System.out.println(mappingDict.get(23).getClass());
		
		String[] temp_pos_st = new String[2];	
		String[] temp_pos_end = new String[2];
		boolean validCoordinates;
		
		try {
			temp_pos_st = prompt.getText().split(";")[0].split(",");
			temp_pos_end = prompt.getText().split(";")[1].split(",");
			validCoordinates = true;
		} catch (Exception f) {
			validCoordinates = false;
		}
		
		int row_start = 0, row_end = 0, col_start = 0, col_end = 0;
		while (validCoordinates) {
			try {
				row_start = Integer.parseInt(temp_pos_st[0]);
				row_end = Integer.parseInt(temp_pos_end[0]);
				col_start = Integer.parseInt(temp_pos_st[1]);
				col_end = Integer.parseInt(temp_pos_end[1]);
				// if (((row_start != row_end) ^ (col_start != col_end)) && validCoordinates(row_start, row_end, col_start, col_end))
				break;
			} catch (Exception f) {
				System.out.println("Invalid coordinates. Try again: ");
			}
		}
		int length;
		boolean horizontalShip = false;
		if (!validCoordinates || (!validCoordinates(row_start, row_end, col_start, col_end))) {
			// tell user that these coordinates are invalid
			System.out.println("Coordinates are invalid. :/");
		} else {
			if (row_start == row_end) {
				length = Math.abs(col_end - col_start) + 1;  // horizontal
				horizontalShip = true;
			} else {
				length = Math.abs(row_end - row_start) + 1;  // vertical
			}
			// check if length is correct
			if (length != placementDecision) {
				validCoordinates = false;
				// tell user that these coordinates are invalid
			}
		}
		
		// coordinates are good
		if (validCoordinates) {
			row_start -= 1;
			col_start -=1;
			row_end -=1;
			col_end -= 1;
			int[] startingPos = {row_start, col_start};
			int[] endingPos = {row_end, col_end};
			int square1 = 0, square2 = 0;
			System.out.println(Arrays.toString(startingPos));
			for (int[] key: posToNum.keySet()) {
				if (Arrays.equals(key, startingPos)) {
					square1 = posToNum.get(key);
					break;
				}
			}
			for (int[] key: posToNum.keySet()) {
				if (Arrays.equals(key, endingPos)) {
					square2 = posToNum.get(key);
					break;
				}
			}
			posToNum.entrySet().forEach(entry -> {
			    System.out.println(Arrays.toString(entry.getKey()) + " " + entry.getValue());
			});
			
			if (horizontalShip) {
				for (int i = Math.min(square1, square2); i < Math.max(square1, square2) + 1; i++) {
					mappingDict.get(i).setStyle("-fx-background-color: MediumSeaGreen");
				}
			} else {
				for (int i = Math.min(square1, square2); i < Math.max(square1, square2) + 1; i++) {
					mappingDict.get(i).setStyle("-fx-background-color: MediumSeaGreen");
					i += Board.size - 1;
				}
			}
			placementDecision--;
			
			/*int[] pos = {Integer.parseInt(temp_pos[0]),Integer.parseInt(temp_pos[1])};
			switch(placementDecision)
			{
			case 0{
				
			}
			
			case 1{
				
			}
			
			case 2{
				
			}
			
			case 3{
				
			}
			
			case 4{
				
			}
			
			case 5{
				placementDecision = 0;
			}*/
			System.out.println(Arrays.toString(temp_pos_st));
			System.out.println(Arrays.toString(temp_pos_end));
			}
		}
	
	@FXML
	private void handleButtonAction(ActionEvent e) {

		int[] pos = new int[2];
		pos = getPOS(e);
		System.out.println("Row: " + pos[0] + " Column: " + pos[1]);
	}
	
	private int[] getPOS(ActionEvent e) {
		int row = 0, col = 0;
		if (e.getSource() == button0) {
			row = 0;
			col = 0;
		} else if (e.getSource() == button1) {
		    row = 0;
		    col = 1;
		} else if (e.getSource() == button2) {
		    row = 0;
		    col = 2;
		} else if (e.getSource() == button3) {
		    row = 0;
		    col = 3;
		} else if (e.getSource() == button4) {
		    row = 0;
		    col = 4;
		} else if (e.getSource() == button5) {
		    row = 0;
		    col = 5;
		} else if (e.getSource() == button6) {
		    row = 0;
		    col = 6;
		} else if (e.getSource() == button7) {
		    row = 0;
		    col = 7;
		} else if (e.getSource() == button8) {
		    row = 1;
		    col = 0;
		} else if (e.getSource() == button9) {
		    row = 1;
		    col = 1;
		} else if (e.getSource() == button10) {
		    row = 1;
		    col = 2;
		} else if (e.getSource() == button11) {
		    row = 1;
		    col = 3;
		} else if (e.getSource() == button12) {
		    row = 1;
		    col = 4;
		} else if (e.getSource() == button13) {
		    row = 1;
		    col = 5;
		} else if (e.getSource() == button14) {
		    row = 1;
		    col = 6;
		} else if (e.getSource() == button15) {
		    row = 1;
		    col = 7;
		} else if (e.getSource() == button16) {
		    row = 2;
		    col = 0;
		} else if (e.getSource() == button17) {
		    row = 2;
		    col = 1;
		} else if (e.getSource() == button18) {
		    row = 2;
		    col = 2;
		} else if (e.getSource() == button19) {
		    row = 2;
		    col = 3;
		} else if (e.getSource() == button20) {
		    row = 2;
		    col = 4;
		} else if (e.getSource() == button21) {
		    row = 2;
		    col = 5;
		} else if (e.getSource() == button22) {
		    row = 2;
		    col = 6;
		} else if (e.getSource() == button23) {
		    row = 2;
		    col = 7;
		} else if (e.getSource() == button24) {
		    row = 3;
		    col = 0;
		} else if (e.getSource() == button25) {
		    row = 3;
		    col = 1;
		} else if (e.getSource() == button26) {
		    row = 3;
		    col = 2;
		} else if (e.getSource() == button27) {
		    row = 3;
		    col = 3;
		} else if (e.getSource() == button28) {
		    row = 3;
		    col = 4;
		} else if (e.getSource() == button29) {
		    row = 3;
		    col = 5;
		} else if (e.getSource() == button30) {
		    row = 3;
		    col = 6;
		} else if (e.getSource() == button31) {
		    row = 3;
		    col = 7;
		} else if (e.getSource() == button32) {
		    row = 4;
		    col = 0;
		} else if (e.getSource() == button33) {
		    row = 4;
		    col = 1;
		} else if (e.getSource() == button34) {
		    row = 4;
		    col = 2;
		} else if (e.getSource() == button35) {
		    row = 4;
		    col = 3;
		} else if (e.getSource() == button36) {
		    row = 4;
		    col = 4;
		} else if (e.getSource() == button37) {
		    row = 4;
		    col = 5;
		} else if (e.getSource() == button38) {
		    row = 4;
		    col = 6;
		} else if (e.getSource() == button39) {
		    row = 4;
		    col = 7;
		} else if (e.getSource() == button40) {
		    row = 5;
		    col = 0;
		} else if (e.getSource() == button41) {
		    row = 5;
		    col = 1;
		} else if (e.getSource() == button42) {
		    row = 5;
		    col = 2;
		} else if (e.getSource() == button43) {
		    row = 5;
		    col = 3;
		} else if (e.getSource() == button44) {
		    row = 5;
		    col = 4;
		} else if (e.getSource() == button45) {
		    row = 5;
		    col = 5;
		} else if (e.getSource() == button46) {
		    row = 5;
		    col = 6;
		} else if (e.getSource() == button47) {
		    row = 5;
		    col = 7;
		} else if (e.getSource() == button48) {
		    row = 6;
		    col = 0;
		} else if (e.getSource() == button49) {
		    row = 6;
		    col = 1;
		} else if (e.getSource() == button50) {
		    row = 6;
		    col = 2;
		} else if (e.getSource() == button51) {
		    row = 6;
		    col = 3;
		} else if (e.getSource() == button52) {
		    row = 6;
		    col = 4;
		} else if (e.getSource() == button53) {
		    row = 6;
		    col = 5;
		} else if (e.getSource() == button54) {
		    row = 6;
		    col = 6;
		} else if (e.getSource() == button55) {
		    row = 6;
		    col = 7;
		} else if (e.getSource() == button56) {
		    row = 7;
		    col = 0;
		} else if (e.getSource() == button57) {
		    row = 7;
		    col = 1;
		} else if (e.getSource() == button58) {
		    row = 7;
		    col = 2;
		} else if (e.getSource() == button59) {
		    row = 7;
		    col = 3;
		} else if (e.getSource() == button60) {
		    row = 7;
		    col = 4;
		} else if (e.getSource() == button61) {
		    row = 7;
		    col = 5;
		} else if (e.getSource() == button62) {
		    row = 7;
		    col = 6;
		} else if (e.getSource() == button63) {
		    row = 7;
		    col = 7;
		}
		int[] temp_pos = {row,col};
		return temp_pos;
	}
	
	public boolean validCoordinates(int a, int b, int c, int d) {
		/**
		 * Return True iff all parameters are between 1 and Board.size (inclusive).
		 */
		int[] array = {a, b, c, d};
		for (int num: array) {
			if(num < 1 || num > Board.size)
				return false;
		}
		return true;
	}
	
	public HashMap<int[], Integer> generatePosToNumDict() {
		HashMap<int[], Integer> posToNum = new HashMap<int[], Integer>();
		int[] array0 = {0, 0};
		posToNum.put(array0, 0);
		int[] array1 = {0, 1};
		posToNum.put(array1, 1);
		int[] array2 = {0, 2};
		posToNum.put(array2, 2);
		int[] array3 = {0, 3};
		posToNum.put(array3, 3);
		int[] array4 = {0, 4};
		posToNum.put(array4, 4);
		int[] array5 = {0, 5};
		posToNum.put(array5, 5);
		int[] array6 = {0, 6};
		posToNum.put(array6, 6);
		int[] array7 = {0, 7};
		posToNum.put(array7, 7);
		int[] array8 = {1, 0};
		posToNum.put(array8, 8);
		int[] array9 = {1, 1};
		posToNum.put(array9, 9);
		int[] array10 = {1, 2};
		posToNum.put(array10, 10);
		int[] array11 = {1, 3};
		posToNum.put(array11, 11);
		int[] array12 = {1, 4};
		posToNum.put(array12, 12);
		int[] array13 = {1, 5};
		posToNum.put(array13, 13);
		int[] array14 = {1, 6};
		posToNum.put(array14, 14);
		int[] array15 = {1, 7};
		posToNum.put(array15, 15);
		int[] array16 = {2, 0};
		posToNum.put(array16, 16);
		int[] array17 = {2, 1};
		posToNum.put(array17, 17);
		int[] array18 = {2, 2};
		posToNum.put(array18, 18);
		int[] array19 = {2, 3};
		posToNum.put(array19, 19);
		int[] array20 = {2, 4};
		posToNum.put(array20, 20);
		int[] array21 = {2, 5};
		posToNum.put(array21, 21);
		int[] array22 = {2, 6};
		posToNum.put(array22, 22);
		int[] array23 = {2, 7};
		posToNum.put(array23, 23);
		int[] array24 = {3, 0};
		posToNum.put(array24, 24);
		int[] array25 = {3, 1};
		posToNum.put(array25, 25);
		int[] array26 = {3, 2};
		posToNum.put(array26, 26);
		int[] array27 = {3, 3};
		posToNum.put(array27, 27);
		int[] array28 = {3, 4};
		posToNum.put(array28, 28);
		int[] array29 = {3, 5};
		posToNum.put(array29, 29);
		int[] array30 = {3, 6};
		posToNum.put(array30, 30);
		int[] array31 = {3, 7};
		posToNum.put(array31, 31);
		int[] array32 = {4, 0};
		posToNum.put(array32, 32);
		int[] array33 = {4, 1};
		posToNum.put(array33, 33);
		int[] array34 = {4, 2};
		posToNum.put(array34, 34);
		int[] array35 = {4, 3};
		posToNum.put(array35, 35);
		int[] array36 = {4, 4};
		posToNum.put(array36, 36);
		int[] array37 = {4, 5};
		posToNum.put(array37, 37);
		int[] array38 = {4, 6};
		posToNum.put(array38, 38);
		int[] array39 = {4, 7};
		posToNum.put(array39, 39);
		int[] array40 = {5, 0};
		posToNum.put(array40, 40);
		int[] array41 = {5, 1};
		posToNum.put(array41, 41);
		int[] array42 = {5, 2};
		posToNum.put(array42, 42);
		int[] array43 = {5, 3};
		posToNum.put(array43, 43);
		int[] array44 = {5, 4};
		posToNum.put(array44, 44);
		int[] array45 = {5, 5};
		posToNum.put(array45, 45);
		int[] array46 = {5, 6};
		posToNum.put(array46, 46);
		int[] array47 = {5, 7};
		posToNum.put(array47, 47);
		int[] array48 = {6, 0};
		posToNum.put(array48, 48);
		int[] array49 = {6, 1};
		posToNum.put(array49, 49);
		int[] array50 = {6, 2};
		posToNum.put(array50, 50);
		int[] array51 = {6, 3};
		posToNum.put(array51, 51);
		int[] array52 = {6, 4};
		posToNum.put(array52, 52);
		int[] array53 = {6, 5};
		posToNum.put(array53, 53);
		int[] array54 = {6, 6};
		posToNum.put(array54, 54);
		int[] array55 = {6, 7};
		posToNum.put(array55, 55);
		int[] array56 = {7, 0};
		posToNum.put(array56, 56);
		int[] array57 = {7, 1};
		posToNum.put(array57, 57);
		int[] array58 = {7, 2};
		posToNum.put(array58, 58);
		int[] array59 = {7, 3};
		posToNum.put(array59, 59);
		int[] array60 = {7, 4};
		posToNum.put(array60, 60);
		int[] array61 = {7, 5};
		posToNum.put(array61, 61);
		int[] array62 = {7, 6};
		posToNum.put(array62, 62);
		int[] array63 = {7, 7};
		posToNum.put(array63, 63);
		return posToNum;
	}
	
}