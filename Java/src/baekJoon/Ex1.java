package baekJoon;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if (a > b)
		{
			System.out.println(">");
		}
		else if (a == b)
		{
			System.out.println("==");
		}
		else
		{
			System.out.println("<");
		}

	}

}
