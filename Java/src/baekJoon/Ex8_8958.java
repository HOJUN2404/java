package baekJoon;

import java.util.Scanner;

public class Ex8_8958 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] arr = new String[scn.nextInt()];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = scn.next();
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int cnt = 0;
			int sum = 0;
			
			for(int j=0 ; j<arr[i].length() ; j++)
			{
				if(arr[i].charAt(j) == 'O')
				{
					cnt ++;
				}
				else
				{
					cnt = 0;
				}
				
				sum += cnt;
			}
			
			System.out.println(sum);	
		}
		
		
		

	}

}
