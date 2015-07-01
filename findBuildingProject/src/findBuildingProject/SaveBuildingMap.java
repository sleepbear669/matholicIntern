package findBuildingProject;

import java.io.IOException;
import java.util.ArrayList;

public class SaveBuildingMap {

	public void save(int[][] map, int[] buildingNumber) throws IOException {

		FileWrite fileWrite = new FileWrite();
		ArrayList<String> dataList = new ArrayList<String>();
		int height = map.length;
		int weight = map[0].length;
		for (int i = 0; i < height; i++) {
			String temp = "";
			for (int j = 0; j < weight; j++) {
				if (map[i][j] != 0)
					temp += (map[i][j] - 1);
				else
					temp += 0;
			}
			dataList.add(temp);
		}

		for (int i = 0; i < buildingNumber.length; i++)
			dataList.add((i + 1) + "동은 " + buildingNumber[i] + " 채 있습니다.");

		fileWrite.write(dataList);
	}
}
