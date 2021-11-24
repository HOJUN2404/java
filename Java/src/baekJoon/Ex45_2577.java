package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex45_2577 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		
		
		int a = scn.nextInt() * scn.nextInt() * scn.nextInt() ;
		
		int[] arrNum = new int[10];
		String aa = String.valueOf(a);
		
		for(int i = 0 ; i<aa.length() ; i++)
		{
			arrNum[(aa.charAt(i) - 48)]++;
		}
		
		for(int z : arrNum)
		{
			System.out.println(z);
		}

	}

}
