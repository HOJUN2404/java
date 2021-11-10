package programmers;

public class DevisorCount extends Solution1{

	public static void main(String[] args) {
		
		System.out.println(solution(13, 17));
		
		System.out.println(solution(24, 27));
		
	}
	
}

class Solution1 {
    public static int solution(int left, int right) {
        
    	int answer = 0;
    	
    	
        for(int i = left ; i <= right ; i++){
        	int count = 0;
        	
        	for(int j = 1 ; j <= i ; j++) {
        		
        		if ( (i%j) == 0 ) {
//        			System.out.printf("%d, %d \n", i, j);
        			count++;
        		}
        	}
        	
        	if(count % 2 == 0) {
//        		System.out.println("count °ª :: " + count);
        		answer += i;
        	}
        	else {
        		answer -= i;
        	}
        		
        }
        
        return answer;
    }
}
