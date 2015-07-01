package logAnalysisProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogFileReader {
	
	private String filePath;
	private BufferedReader bufferReader;
	LogFileReader(String filePath) throws FileNotFoundException{
		this.filePath = filePath;
		FileInputStream fstream = new FileInputStream(filePath);
		bufferReader = new BufferedReader(new InputStreamReader(fstream));
	}
	
	public void close() throws IOException{
		bufferReader.close();
	}

	public String readLine() throws IOException{
		 String line = bufferReader.readLine();
		return line;
	}
}
