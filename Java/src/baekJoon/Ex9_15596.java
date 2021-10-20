package baekJoon;

import java.util.Scanner;

public class Ex9_15596 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] a = new int[scn.nextInt()];
		
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = scn.nextInt();
		}
		
		

	}
	
	class Test {
		long sum(int[] a) {
		
			long sum = 0;
			
			for(int i = 0 ; i < a.length ; i++)
			{
				sum += a[i];
			}
			
			return sum;
		}
		
		
	}
}


