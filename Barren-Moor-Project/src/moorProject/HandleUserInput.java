package moorProject;

import java.util.Scanner;

public class HandleUserInput {
	static Scanner s = new Scanner(System.in);
	
	public static String readInput(Player p, int[][] grid) {
		
		String readIn = s.nextLine();
		readIn = readIn.toLowerCase();

		if (readIn.equals("north") || readIn.equals("south") || readIn.equals("east") || readIn.equals("west")) {

			switch (readIn) {
			case "north":
				p.moveNorth(grid);
				//p.checkPlayerAtGoal();
				break;
			case "east":
				p.moveEast(grid);
			//	p.checkPlayerAtGoal();
				break;
			case "south":
				p.moveSouth(grid);
				//p.checkPlayerAtGoal();
				break;
			case "west":
				p.moveWest(grid);
				//p.checkPlayerAtGoal();
				break;
			default:
				;
				break;
			}
			return readIn;
		}
		else
			return "Invalid Input, Try Again";
	}
}
