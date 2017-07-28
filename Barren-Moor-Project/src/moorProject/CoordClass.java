package moorProject;

public class CoordClass {

	public static void createGridPositions(){
		int rows = 7;
		int columns = 7;
		int [][] gridPos = new int [columns][rows];
		int xValue = 0;
		int yValue =0;
		
		gridPos[3][3] = 1;
		
		for(int i = 0; i < gridPos.length; i++){
			System.out.println("");
			for(int j = 0; j < gridPos[0].length; j++){
				
				System.out.print(gridPos[i][j]);
			}
			//System.out.println(gridPos[i][j]);
		}
		
	}
	
	
}
