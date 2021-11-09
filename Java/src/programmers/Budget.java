package programmers;

import java.util.Arrays;

public class Budget extends Solution{

	public static void main(String[] args) {
		// 프로그래머스 [1단계] - 예산 문제 
		int[] d = {2,2,3,3};
		
		int result = solution(d, 10);
		
		System.out.println(result);
	}

}

class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = 0 ; i < d.length ; i++) {
        	if(d[i] <= budget) {
        		answer ++;
        		budget -= d[i];
        	}
        	else {
        		break;
        	}
        }
        
        return answer;
    }
}
