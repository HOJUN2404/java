package baekJoon;

import java.util.Scanner;

public class Ex3_1110 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		
		
		
		
		int b = 0;
		
		while(true) {
		
			String strA = Integer.toString(a);
			int [] arrNum = new int[strA.length()];
			
			for (int i=0 ; i < strA.length() ; i++)
			{
				arrNum[i] = strA.charAt(i) - '0';
			}
			
			int c = (arrNum[0] + arrNum [1]) % 10;
			
			System.out.println(c);
			
			String d = Integer.toString(arrNum[1]) + Integer.toString(c); 
			b = Integer.parseInt(d);
			
			if(a == b)
			{
				break;
			}
			
			a = b;
		}

	}

}
