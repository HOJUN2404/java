package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Ex51_4344 {

	public static void main(String[] args) throws IOException {
		// 백준 4344 [ 평균은 넘겠지 .. ]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine());
		
		
		for(int i = 0 ; i < C ; i++) {
			st = new StringTokenizer(br.readLine());
			
			int sum = 0, count = 0;
			int C2 = Integer.parseInt(st.nextToken());
			int[] arr = new int[C2];
			
			for(int j = 0 ; j < C2 ; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				
				sum += arr[j];
			}
			
			for(int z = 0 ; z < C2 ; z++) {
				if(arr[z] > (sum/C2)) {
					count++;
				}
			}
			
			DecimalFormat form = new DecimalFormat("0.000");
			
			System.out.println(form.format(((double)count / (double)C2) * 100)+ "%");
//			System.out.println(C2);
			
//			System.out.println(count / C2 * 100);
			
			
		}

	}

}
