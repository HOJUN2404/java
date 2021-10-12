package JavaPractice;

import java.util.Scanner;

public class ch1 {
	// 면접 전 for문 연습하기
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// for문 2741번
//		System.out.println("숫자 n을 입력하세요 : ");
//		int i = 1;
//		
//		int n = scanner.nextInt();
//
//		for(i=1 ; i<=n ; i++)
//		{
//			System.out.println(i);
//		}
//		
//		// for문 2742번
//		for(i = n ; i > 0 ; i--)
//		{
//			System.out.println(n);
//			
//			n--;
//		}
		
		
		// for문 11022번
		
		int a = scanner.nextInt();
		
		for (int i = 1 ; i <= a ; i++)
		{
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			System.out.println("Case #" + i + " : " + (b + c));
		}
		
		System.out.println("연산 종료");
		scanner.close();
		
		
	}
	
	
	public static void ex2(String[] args) {
		
	}

}
