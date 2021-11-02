package JavaPractice;

public class ch7_1102 {

	public static void main(String[] args) {
		int count = 0;
        
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		Solution s = new Solution();

	}

}


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
    	System.out.println("гоюл");
        int count = 0;
        
        for(int i = 0 ; i<6 ; i++)
        {
            for(int j=0 ; j<6 ; j++)
            {
                if(lottos[i] == win_nums[j])
                {
                    count ++;
                }
            }
        }
        	
        System.out.println(count);
        
        int[] answer = {};
        return answer;
    }
}