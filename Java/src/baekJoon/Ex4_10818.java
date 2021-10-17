package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_10818 {

	public static void main(String[] args) {
		// 백준 배열 10818 문제 
		
		Scanner scn = new Scanner(System.in);
        
		int N = scn.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
        
		scn.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);

	}

}
