package baekJoon;

import java.util.Scanner;

public class Ex52_2908 {

	public static void main(String[] args) {
		// [백준] 2908번 문제 '상수' by 김호준
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		
		String newA = String.valueOf((Integer.toString(a)).charAt(2)) + String.valueOf((Integer.toString(a)).charAt(1)) + String.valueOf((Integer.toString(a)).charAt(0));
		String newB = String.valueOf((Integer.toString(b)).charAt(2)) + String.valueOf((Integer.toString(b)).charAt(1)) + String.valueOf((Integer.toString(b)).charAt(0));
		
		if(Integer.parseInt(newA) > Integer.parseInt(newB)) {
			System.out.println(newA);
		}
		else {
			System.out.println(newB);
		}
	}

}
