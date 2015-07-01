package gom.cave.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
	public static void main(String[] args) throws SQLException, InterruptedException, ExecutionException {
		
		long startTime = System.currentTimeMillis();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		int startId = 1;
//		List<Future> futureList = new ArrayList<Future>(); 
		for (int i = 1; i <= 10; i++) {
			executorService.execute(new UserInsertRunnable(
					startId, 100000));
			startId += 100000;
//			futureList.add(future);
		}
//		for(int i = 0 ; i < futureList.size(); i++){
//			futureList.get(i).get();
//		}
//		executorService.shutdown();
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println((time/1000));
	} 

	public static String randomString(int length) {
		char[] charArr = new char[length];
		for (int i = 0; i < length; i++) {
			charArr[i] = (char) (Math.random() * 25 + 65);
		}
		return new String(charArr);
	}

	public static int randomInt(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + (min));
	}
}
