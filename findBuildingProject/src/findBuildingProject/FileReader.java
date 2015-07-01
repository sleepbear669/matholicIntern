package findBuildingProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileReader {
	
	public BufferedReader getFileBufferedReader(String filePath) throws FileNotFoundException{
		FileInputStream fstream = new FileInputStream(filePath);
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(fstream));
		return bufferReader;
	}
}
