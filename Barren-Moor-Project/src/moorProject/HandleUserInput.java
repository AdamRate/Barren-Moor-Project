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
				break;
			case "east":
				p.moveEast(grid);
				break;
			case "south":
				p.moveSouth(grid);
				break;
			case "west":
				p.moveWest(grid);
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
