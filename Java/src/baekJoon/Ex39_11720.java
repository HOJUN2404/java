package baekJoon;

import java.util.Scanner;

public class Ex39_11720 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		String b = scn.next();
		
		int sum = 0;
		
		
		
		for(int i=0 ; i<b.length() ; i++)
		{
			sum += b.charAt(i)-48;
		}
		
		System.out.println(sum);
		
		
	}

}
