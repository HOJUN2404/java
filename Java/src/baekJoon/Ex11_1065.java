package baekJoon;

import java.util.Scanner;

public class Ex11_1065 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int han = 0;
		
		
		if(n < 100)
		{
			han = n;
		}
		else
		{
			han = 99;
			
			if(n == 1000) 
			{
				n = 999;  
			}
			
			for(int i = 100 ; i <= n ; i++)
			{
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one))
				{
					han++;
				}
			}
		}
		
		System.out.println(han);
	}

}
