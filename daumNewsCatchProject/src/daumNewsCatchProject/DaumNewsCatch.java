package daumNewsCatchProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaumNewsCatch {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		System.out.println("hello world");

		UrlParser urlParser = new UrlParser();
		String html = urlParser.htmlParse("http://www.daum.net");
		String[] expresstions = { "<ul class=\"list_imgtxt #news\">(.*?)</ul>",
				"<li class=\"fst_txt|txt\">(.*?)</li>", "http://[^>^\"]*" };
		Regex regex = new Regex();
		String result = regex.regularExpression(html, expresstions);
		String[] newsURLArray = result.split("\n");
		NewsFileWriter newsFileWriter = new NewsFileWriter();
		
		for( int i = 0 ; i < newsURLArray.length ; i++){
			String newsHtml = urlParser.htmlParse(newsURLArray[i]);
			newsFileWriter.write(i +"", newsHtml);
		}
		
	}

}
