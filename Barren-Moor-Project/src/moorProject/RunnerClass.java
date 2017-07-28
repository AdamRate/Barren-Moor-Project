package moorProject;

public class RunnerClass {

	public static void main(String[] args) {
		
		System.out.println("You find yourself in the middle of a swamp");
		//playSound.play();
		System.out.println("Try using different commands to escape");
		
		CoordClass c = new CoordClass();
		c.createGridPositions();

		System.out.println("You are " + c.calcDistanceAway() + "m Away from the objective");
			boolean playing = true;
		//while (playing != false){
			//readInput();
			//Update Player on surroundings/distance away
			//Read User input
			//Handle User input
		//}
		

		c.moveWest();
		c.moveWest();
		c.moveWest();
		c.moveNorth();
		c.moveNorth();
		c.moveNorth();
		
	}

}
