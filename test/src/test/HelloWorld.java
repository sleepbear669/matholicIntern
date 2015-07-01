package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String argv[]){
		int a,b;
		int count = 0;
		int carry = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수 입력");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		while(a != 0 || b != 0){
			int firstNum1 = a % 10;
			int firstNum2 = b % 10;
			int sum = firstNum1 + firstNum2 + carry;
			a /= 10;
			b /= 10;
			if ( sum  >= 10){
				carry = 1;
				count++;
			}
			else carry = 0;
		}
		
		System.out.println(count);
		 BufferedWriter bufferedWriter;
		 String txt  = "testt";
		    try {
		        bufferedWriter = new BufferedWriter(new FileWriter("sample.txt"));
		        bufferedWriter.write(txt);
		        bufferedWriter.close();
		    }
		    catch (IOException e) {
		        // 파일 입출력 예외에 대한 코드는 여기에 작성하세요.
		        System.out.println("sample.txt 파일을 열 수 없습니다.");
		        e.printStackTrace();
		    }
	}
}
