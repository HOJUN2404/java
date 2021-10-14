package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_1014 {

	public static void main(String[] args) throws IOException {
		// 10월 14일 Java의 정석 책을 읽으며 부족한 부분은 직접 실습해보자 ! 또한 백준도 열심히 풀자 ! 
		
		Scanner scn = new Scanner (System.in);
		
		
		//BufferReader은 공백을 기준으로만 인식하고 데이터가 String으로 고정되기 떄문에 형변환 해주는 로직이 많을 수 있다.
		// 또한 import 할 사항도 많지만, Scanner 보다는 빠르다 !! 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// s에 한줄 입력받은 값을 가지고 있다. 
		String s = br.readLine();
		
		// s를 공백을 기준으로 잘라 배열 Array 에 저장한다.
		String Array[] = s.split(" ");
		
		System.out.println(Array[1]);
		
		int a1 = scn.nextInt();
		
		//삼항 연산자 오랜만에 해보기 !! 
		String result = (a1 > 10 ? "Up" : "Down");
		System.out.println(result);
	}

}
