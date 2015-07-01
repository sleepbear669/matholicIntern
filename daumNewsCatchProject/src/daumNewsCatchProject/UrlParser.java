package daumNewsCatchProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlParser {
	public String htmlParse(String urlStr) throws IOException{
		URL url = new URL(urlStr);
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(url.openStream()));
		String line;
		StringBuffer stringBuffer = new StringBuffer();
		while( ( line = bufferedReader.readLine()) != null){
			stringBuffer.append(line);
		}
		return stringBuffer.toString();
	}
	

}
