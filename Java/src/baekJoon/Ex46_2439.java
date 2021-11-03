package baekJoon;

import java.util.Scanner;

public class Ex46_2439 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a= scn.nextInt();
		
		for(int i = 0 ; i<a ; i++)
		{
			for(int j = i ; j < a-1 ; j++)
			{
				System.out.print(" ");
			}
			
			for(int z = 0 ; z < i+1 ; z++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
