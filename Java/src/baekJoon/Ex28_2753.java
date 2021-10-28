package baekJoon;

import java.util.Scanner;

public class Ex28_2753 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		if(a % 4 == 0)
		{
			if(a % 100 != 0 || a % 400 == 0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
		else
		{
			System.out.println("0");
		}

	}

}
