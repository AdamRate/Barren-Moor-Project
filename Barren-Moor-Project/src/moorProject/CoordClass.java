package moorProject;

public class CoordClass {
	int goalXValue;
	int goalYValue;
	int rows = 7;
	int columns = 7;
	

	public int[][] createGridPositions(int[][] gridPos) {
		goalXValue = 0;
		goalYValue = 0;
		
		  for (int i = 0; i < gridPos.length; i++) { System.out.println("");
		  for (int j = 0; j < gridPos[0].length; j++) {
		  
		  System.out.print("[" + gridPos[i][j] + "]" + " "); } }
		  System.out.println("\n");
		 
		return gridPos;
	}
}
