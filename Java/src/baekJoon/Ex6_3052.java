package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_3052 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int arr[] = new int[10];
		int arr2[] = new int[10];
		
		int count = 0;
		
		for(int i=0 ; i<10 ; i++)
		{
			arr[i] = scn.nextInt();
			arr2[i] = arr[i] % 42;
		}
		
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0 ; i<9 ; i++) 
		{
			for(int j=1 ; j<10 ; j++)
			{
				if(arr2[i] == arr2[j])
				{
					count ++;
				}
			}
		}
		
		System.out.println(count);
		
		System.out.println(10 - count);
		

	}

}
