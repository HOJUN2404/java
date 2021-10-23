package baekJoon;

import java.util.Scanner;

public class Ex13_11720 {

	public static void main(String[] args) {
		// 11720 숫자의 합
		
		Scanner scn = new Scanner(System.in);
		
		int [] arr = new int[scn.nextInt()];
		
		int b = (int)scn.nextFloat();
		
		int sum = 0;
		
		
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = (int)(b % 10);
			
			b = (int)(b / 10) ;
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum += arr[i]; 
		}
		
		System.out.println(sum);

	}

}
