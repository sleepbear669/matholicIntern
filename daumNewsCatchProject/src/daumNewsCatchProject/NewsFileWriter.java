package daumNewsCatchProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewsFileWriter {
	public void write(String title, String article) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(title + ".txt"));
		bufferedWriter.write(article);
	}

}
