package baekJoon;

import java.util.Scanner;

public class Ex29_8393 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i<a+1 ; i++)
		{
			sum += i;
		}
		System.out.println(sum);

	}

}
