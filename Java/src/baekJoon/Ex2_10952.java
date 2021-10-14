package baekJoon;

import java.util.Scanner;

public class Ex2_10952 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) 
		{
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			if(a == 0 && b == 0)
			{
				scn.close();
				break;
			}
			
			System.out.println(a + b);
		}

	}

}
