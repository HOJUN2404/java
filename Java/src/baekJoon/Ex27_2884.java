package baekJoon;

import java.util.Scanner;

public class Ex27_2884 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a==0)
		{
			if(b<45)
			{
				System.out.printf("23 %d",b+15);
			}
			else
			{
				System.out.printf("0 %d",b-45);
			}
		}
		else if(a != 0 && b<45)
		{
			System.out.printf("%d %d",a-1,b+15);
		}
		else
		{
			System.out.printf("%d %d",a,b-45);
		}
				

	}

}
