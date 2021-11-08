package baekJoon;

import java.util.Scanner;

public class Ex40_10809 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		int[] arr = new int[26];
		
		for(int i = 0 ; i < arr.length ; i++) 
		{
			char aa = (char)(i+97);
			
			if(s.contains(Character.toString(aa))) 
			{
				arr[i] = s.indexOf(aa);
			}
			else
			{
				arr[i] = -1;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}
		
		
		
//		for(int i = 97 ; i<123 ; i++)
//		{
//			char aa = (char)i;
//			
//			if(s.contains(Character.toString(aa)))
//			{
//				arr[i] = s.indexOf(aa);
//			}
//			else
//			{
//				arr[i] = -1;
//			}
//		}
//		
//		for(int j = 0 ; j<arr.length ; j++)
//		{
//			System.out.println(arr[j]);
//		}

	}

}
