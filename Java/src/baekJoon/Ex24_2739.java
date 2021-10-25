package baekJoon;

import java.util.Scanner;

public class Ex24_2739 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		for(int i = 1 ; i < 10 ; i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}

	}

}
