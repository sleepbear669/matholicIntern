package logAnalysisProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogFileWriter {
	private BufferedWriter bufferedWriter;
	private String filePath;
//	bufferedWriter = new BufferedWriter(new FileWriter("sample.txt"));
	public void createFile() throws IOException{
		bufferedWriter = new BufferedWriter(new FileWriter("request_cont.txt") );
	}
	public void writerLine(String ip, Integer count) throws IOException{
		int countStr = count.intValue();
		String line = ip + " requested " +countStr;
//		System.out.println(line);
		bufferedWriter.write(line);
		bufferedWriter.newLine();
//		System.out.println(line);
	}
	public void close() throws IOException{
		bufferedWriter.close();
	}
}
