package JavaPractice;

import java.util.Arrays;

public class ch4_1017 {

	public static void main(String[] args) {
		// Java의 정석 [ 배열 연습하기 ]
		
		String [][] words = {
								{"의자", "chair"},
								{"책상", "desk"},
								{"연필", "pensil"}
							};
		
		String [][] words2 = {
								{"의자", "chair"},
								{"책상", "desk"},
								{"연필", "pensil"}
							 };
		
		
		System.out.println(words[0][0]);
		System.out.println(words[0][1]);
		
		for(int i=0 ; i<words.length ; i++)
		{
			System.out.printf("%s 의 뜻은 %s 입니다. \n", words[i][1], words[i][0]);
			
		}
		
		
		//다차원 배열의 경우 Arrays.deepEquals 를 사용해야 한다. 
		System.out.println(Arrays.equals(words, words2));
		System.out.println(Arrays.deepEquals(words, words2));
		
		//배열의 복사 
		int [] a = {3, 4, 5, 6, 7};
		
		int [] a1 = Arrays.copyOf(a, 3);
		int [] a2 = Arrays.copyOf(a, 9);
		int [] a3 = Arrays.copyOfRange(a, 2, 4);
		int [] a4 = Arrays.copyOfRange(a, 0, 10);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		
		
		
	}
}
