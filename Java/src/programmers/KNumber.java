

package programmers;


import java.util.Arrays;


public class KNumber {

	public static void main(String[] args) {
		// 프로그래머스 1단계 k번째 수 
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = Solution(array, commands);
		
		System.out.println(result);

	}

	private static int[] Solution(int[] array, int[][] commands) {
		int[] answer = {};
		int[] newArray = new int[3];
		
		for(int i = 0 ; i<commands.length ; i++) {
			newArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(newArray);
			
			answer[i] = newArray[commands[i][2]-1];
			
		}
		
		
        return answer;
		
	}

}

/*
 * class Solution (int[] array, int[][] commands) {
 * 
 * private static int[] ss (int[] array, int[][] commands) { int[] newArray ;
 * 
 * return newArray; }
 * 
 * 
 * }
 */