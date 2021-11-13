package baekJoon;

import java.util.Scanner;

public class Ex49_1110 {

	public static void main(String[] args) {
		// 백준 While 문제 1110 번 
		
		Scanner scn = new Scanner(System.in);
		
		int count = 0;
		int N = scn.nextInt();
		int newN = 0, answer = N;
		int frontNum, backNum = 0;
		
		if(N == 0) {
			count++;
		}
		
		else if(N<10) {
			N = Integer.parseInt(Integer.toString(N) + "0");
			
			count++;
		}
		
		while(N != newN) {
			
			
			if (true) {
				frontNum = (answer % 10);
				backNum = ((answer / 10) + (answer % 10)) % 10;
				
				newN = Integer.parseInt((Integer.toString(frontNum) + Integer.toString(backNum)));
				
				count++;
				
//				System.out.print(count + "   ");
//				System.out.println(newN);
				
				answer = newN;
			}
			
			
		}
		
		System.out.println(count);
		
		


	}

}
