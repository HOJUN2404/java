package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex47_10871 {

	public static void main(String[] args)throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0 ; i < n ; i++)
		{
			int y = Integer.parseInt(st.nextToken());
			
			if(x > y)
			{
				sb.append(y).append(' ');
			}
		}
		
		System.out.println(sb);
		
		
	}

}
