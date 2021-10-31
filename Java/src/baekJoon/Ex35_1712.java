package baekJoon;

import java.util.Scanner;

public class Ex35_1712 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		for(int i = 1 ; true ; i++)
		{
			if(a+(b*i) > a+((b*i)+1))
			{
				System.out.println("-1");
				
				break;
			}
			
			if(a+(b*i) < c*i)
			{
				System.out.println(i);
				break;
			}
		}
				

	}

}
