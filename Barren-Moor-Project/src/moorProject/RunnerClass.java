package moorProject;

public class RunnerClass {

	public static void main(String[] args) {

		System.out.println("You find yourself in the middle of a swamp");
		// playSound.play();
		System.out.println("Try using different commands to escape");
		int[][] gridPos = new int[7][7];
		CoordClass c = new CoordClass();

		boolean playing = true;
		Player p = new Player(3, 3,0,0);

		while (playing) {
			HandleUserInput.readInput(p, c.createGridPositions(gridPos));
			System.out.println("You are " + p.calcDistanceAway(gridPos) + "m Away from the objective");
		}
	}

}
