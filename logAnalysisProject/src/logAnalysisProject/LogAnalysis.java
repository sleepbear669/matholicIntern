package logAnalysisProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LogAnalysis {
	public static void main(String args[]) throws IOException {
		String filePath = "/Users/matholic/Desktop/access.small.log";
		LogFileReader fileReader = null;
		LogFileWriter fileWriter = null;
		long startTime = System.currentTimeMillis();
		RequestCounter requestCounter = new RequestCounter();
		int temp  = 0;
		int lineNum = 0;
		try {
			fileReader = new LogFileReader(filePath);
			fileWriter = new LogFileWriter();
			fileWriter.createFile();
			String strLine;
			while ((strLine = fileReader.readLine()) != null) {
				lineNum++;
//				System.out.println(strLine);
				String ip = strLine.split(" ")[0];
//				System.out.println(ip);
				requestCounter.count(ip);
				temp = requestCounter.getRequestCount(ip);
//				System.out.println(requestCounter.getRequestCount(ip));
			}
			System.out.println(strLine);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}finally{
			fileReader.close();
		}
		
		Map<String, Integer> map = requestCounter.getRequestIpMap();
		Integer total = 0 ;
		
		MapSortByValue mapSortByValue = new MapSortByValue();
		Map<String, Integer> sortedMap = mapSortByValue.ascendingSort(map);
		
		for(Entry<String, Integer> key : sortedMap.entrySet()){
//			System.out.println(key);
			fileWriter.writerLine(key.getKey(), key.getValue());
			total += key.getValue();
		}
		
		System.out.println(lineNum + " " + total);
		if(lineNum == total) System.out.println("로그 갯수 같음 ");
		else System.out.println("파일 잘 못 읽음");
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		fileWriter.close();
		System.out.println("helowWorld " + (runTime/1000) );
	}
}
