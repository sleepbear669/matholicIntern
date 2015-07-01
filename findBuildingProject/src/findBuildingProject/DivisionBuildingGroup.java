package findBuildingProject;

import java.util.List;

public class DivisionBuildingGroup {
	
	private int height, weight;
	private int[][] buildMap;
	private int currnectBuildingNumber;
	
	
	public void setDate(int[][] buildMap, int height, int weight) {
		this.height = height;
		this.weight = weight;
		this.buildMap = new int[height+2][weight+2];
		this.currnectBuildingNumber = 2;
		for(int i = 1 ; i <= height ; i++)
			for( int j = 1; j <= weight ; j++)
				this.buildMap[i][j] = buildMap[ i - 1 ][ j - 1 ];
	}
	private int[][] resizeMap(){
		int[][] map = new int[height][weight];
		for(int i = 0 ; i < height; i++)
			for( int j = 0 ; j < weight ; j++)
				map[i][j] = buildMap[i+1][j+1];
		return map; 
	}
	
	public int[][] division(){
		for(int i = 1; i <= height; i++){
			for( int j  = 1 ; j <= weight ; j++){
				if(buildMap[i][j] == 1 ){
				check(i,j);
				currnectBuildingNumber++;
				}
			}
		}
		return resizeMap();
	}
	
	
	
	private void check(int x, int y){
		int[][] point = { {0,1}, {-1, 0}, {0,-1}, {1,0} };
		buildMap[x][y] = currnectBuildingNumber;
		for(int i = 0 ; i < 4 ; i++ ){
			if(buildMap[x + point[i][0]][y + point[i][1]] == 1){
				check(x+ point[i][0], y + point[i][1]);
			}
		}
	}
    public int getBuildingNumber(){
    	return currnectBuildingNumber - 2;
    }

}
