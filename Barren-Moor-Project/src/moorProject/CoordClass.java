package moorProject;

import java.text.DecimalFormat;

public class CoordClass {
	int playerXValue, goalXValue;
	int playerYValue, goalYValue;
	int rows = 7;
	int columns = 7;
	int[][] gridPos = new int[columns][rows];

	public int createGridPositions() {
		playerXValue = 3;
		playerYValue = 3;
		goalXValue = 0;
		goalYValue =0;
		gridPos[playerXValue][playerYValue] = 1;
		

		for (int i = 0; i < gridPos.length; i++) {
			System.out.println("");
			for (int j = 0; j < gridPos[0].length; j++) {

				System.out.print("[" + gridPos[i][j] + "]" + " ");
			}
		}
		System.out.println("\n");
		return playerXValue + playerYValue;
	}

	public int getPlayerXValue() {
		return playerXValue;
	}

	public int getPlayerYValue() {
		return playerYValue;
	}

	public int getDestXValue(){
		return goalXValue;
	}
	
	public int getDestYValue(){
		return goalYValue;
	}
	
	public void moveNorth() {
		int gotX = getPlayerXValue();
		int gotY = getPlayerYValue();
		gridPos[gotX][gotY] = 0;
		gridPos[gotX - 1][gotY] = 1;
	}

	public void moveEast() {
		int gotX = getPlayerXValue();
		int gotY = getPlayerYValue();
		gridPos[gotX][gotY] = 0;
		gridPos[gotX][gotY + 1] = 1;
	}

	public void moveSouth() {
		int gotX = getPlayerXValue();
		int gotY = getPlayerYValue();
		gridPos[gotX][gotY] = 0;
		gridPos[gotX + 1][gotY] = 1;

	}

	public void moveWest() {
		int gotX = getPlayerXValue();
		int gotY = getPlayerYValue();
		gridPos[gotX][gotY] = 0;
		gridPos[gotX][gotY - 1] = 1;
	}

	public String calcDistanceAway(){
		DecimalFormat df = new DecimalFormat("#.##");
		int playerX = getPlayerXValue();
		int playerY = getPlayerYValue();
		int destX = getDestXValue();
		int destY = getDestYValue();
		
		return df.format(Math.sqrt(Math.pow((playerX-destX),2) + Math.pow((playerY-destY),2)));
	}
	
}
