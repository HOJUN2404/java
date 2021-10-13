package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch2_1013 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
//		// 10월 13일 면접을 보고와서 While 복습
//		
//		
//		while(true) {
//			
//			int A = scn.nextInt();
//			int B = scn.nextInt();
//			
//			
//			if(A==0 && B==0)
//			{
//				break;
//			}
//			
//			System.out.println(A + B);
//		}

		
		
		// BufferedReader 를 사용해서 for문을 풀어보자.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0)
			{
				break;
			}
			
			sb.append((A+B)).append('\n');
		}
		
		System.out.println(sb);
	}
	
	
	
}
