package moorProject;

public class RunnerClass {

	public static void main(String[] args) {
		
		System.out.println("You find yourself in the middle of a swamp");
		//playSound.play();
		System.out.println("Try using different commands to escape");
		
		CoordClass c = new CoordClass();
		c.createGridPositions();
		int playerX = c.getPlayerXValue();
		int playerY = c.getPlayerYValue();
		int destX = c.getDestXValue();
		int destY = c.getDestYValue();
		
		
		//boolean playing = true;
		//while (playing != false){
		//System.out.println("You are " + Pythagoras dX and dY + " Away from the objective");
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
