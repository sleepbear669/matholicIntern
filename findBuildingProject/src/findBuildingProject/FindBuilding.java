package findBuildingProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class FindBuilding {
	public static void main(String argv[]) throws IOException {
		// System.out.println("hello World");
		// int[][] buildMap = { { 1, 1, 0, 0, 1 }, { 1, 1, 0, 1, 1 },
		// { 0, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };

		LoadBuildingMap loadBuildingMap = new LoadBuildingMap();
		int[][] map = loadBuildingMap.getBuildingMap();
		int height = map.length;
		int weight = map[0].length;

		DivisionBuildingGroup divisionBuildingGroup = new DivisionBuildingGroup();
		divisionBuildingGroup.setDate(map, height, weight);
		int[][] divisionBuildingMap = divisionBuildingGroup.division();

		BuildCount buildCount = new BuildCount();
		int buildingNumber = divisionBuildingGroup.getBuildingNumber();
		int[] buildingCountArray = buildCount.count(divisionBuildingMap,
				height, weight, buildingNumber);

		SaveBuildingMap saveBuildingMap = new SaveBuildingMap();
		saveBuildingMap.save(divisionBuildingMap, buildingCountArray);
	}
}
