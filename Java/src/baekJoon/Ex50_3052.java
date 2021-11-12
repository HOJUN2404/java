package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ex50_3052 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		// 배열을 이용한 풀이  
		
//		boolean[] arr = new boolean[42];
//		
//		int count = 0 ;
//		
//		for(int i = 0 ; i<10 ; i++) {
//			arr[Integer.parseInt(br.readLine()) % 42] = true;
//		}
//		
//		for(int j = 0 ; j < arr.length ; j++) {
//			if(arr[j] == true) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		
		// Hash를 이용한 풀이
		
		HashSet<Integer> h = new HashSet<Integer> ();
		
		for (int i = 0 ; i < 10 ; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(h.size());
		

	}

}
