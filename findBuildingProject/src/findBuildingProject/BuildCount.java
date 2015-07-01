package findBuildingProject;

import java.util.ArrayList;
import java.util.List;

public class BuildCount {

	public int[] count(int[][] buildingMap, int height, int weight,
			int buildingNumber) {
		int[] buildingCount = new int[buildingNumber];
		int buildingAddress;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++) {
				buildingAddress = buildingMap[i][j];
				if (buildingAddress != 0) {
					buildingCount[buildingAddress - 2]++;
				}
			}
		}

		return buildingCount;
	}

}
