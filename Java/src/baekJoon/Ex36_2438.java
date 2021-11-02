package baekJoon;

import java.util.Scanner;

public class Ex36_2438 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		for(int i = 0 ; i<a ; i++) 
		{
			for(int j=0 ; j<i+1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
