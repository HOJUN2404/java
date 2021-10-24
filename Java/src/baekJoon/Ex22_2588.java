package baekJoon;

import java.util.Scanner;

public class Ex22_2588 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}

}
