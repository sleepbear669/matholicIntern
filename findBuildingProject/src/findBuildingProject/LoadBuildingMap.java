package findBuildingProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class LoadBuildingMap {
	BufferedReader bufferedReader;
	ArrayList<String> mapStringList;

	public LoadBuildingMap() throws IOException {

		BufferedReader bufferedReader = new FileReader()
				.getFileBufferedReader("another_villege.txt");
		String str = null;
		mapStringList = new ArrayList<String>();
		while ((str = bufferedReader.readLine()) != null) {
			mapStringList.add(str);
		}
	}

	public int[][] getBuildingMap() {
		int height = mapStringList.size();
		int weight = mapStringList.get(0).length();
		int[][] map = new int[height][weight];

		for (int i = 0; i < height; i++) {
			String str = mapStringList.get(i);
			for (int j = 0; j < weight; j++)
				map[i][j] = str.charAt(j) - 48;
		}
		return map;
	}

}
