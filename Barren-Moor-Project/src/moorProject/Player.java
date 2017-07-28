package moorProject;

import java.text.DecimalFormat;

public class Player {
	private int xLoc;
	private int yLoc;

	// Create player object to hold x value and y value
	public Player(int x, int y) {

		this.xLoc = x;
		this.yLoc = y;
	}

	public Player() {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}

	public int getPlayerXValue() {
		return xLoc;
	}

	public int getPlayerYValue() {
		return yLoc;
	}

	public void moveNorth(int[][] grid) {
		grid[xLoc][yLoc] = 0;
		xLoc = xLoc - 1;
		if (xLoc == -1) {
			xLoc = xLoc+1;
			resetPlayer(grid);
		}
		grid[xLoc][yLoc] = 1;
	}

	public void moveEast(int[][] grid) {
		grid[xLoc][yLoc] = 0;
		yLoc = yLoc + 1;
		if (yLoc == grid.length) {
			yLoc=yLoc-1;
			resetPlayer(grid);
		}
		grid[xLoc][yLoc] = 1;
	}

	public void moveSouth(int[][] grid) {
		grid[xLoc][yLoc] = 0;
		xLoc = xLoc + 1;
		
		if (xLoc == grid.length) {
			xLoc = xLoc-1;
			resetPlayer(grid);	
		}
		grid[xLoc][yLoc] = 1;
	}

	public void moveWest(int[][] grid) {
		grid[xLoc][yLoc] = 0;
		yLoc = yLoc - 1;
		if(yLoc == -1){
			yLoc = yLoc+1;
			resetPlayer(grid);
		}
		grid[xLoc][yLoc] = 1;
	}

	public void resetPlayer(int[][] grid){
		System.out.println("You wander for a while, completely lost, before finding the place in which you started");
		grid[xLoc][yLoc]=0;
		xLoc =3;
		yLoc =3;
		grid[xLoc][yLoc]=1;
		
	}

	public String calcDistanceAway(int[][] grid) {
		int x = 0;
		int y = 0;
		grid[x][y] = 2;
		DecimalFormat df = new DecimalFormat("#.##");
		int playerX = getPlayerXValue();
		int playerY = getPlayerYValue();

		return df.format(Math.sqrt(Math.pow((playerX - x), 2) + Math.pow((playerY - y), 2)));
	}
}