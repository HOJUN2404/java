package programmers;

import java.util.Scanner;

public class NewIdRecomend {

	public static void main(String[] args) {
		// 프로그래머스 1단계 - 신규 아이디 추천
		
		Scanner scn = new Scanner(System.in);
		
		String new_id = scn.nextLine();
		
		String answer = "";
		answer = new_id.toLowerCase();
		
        answer = answer.replaceAll("[^\\w\\-_.]*", "").replaceAll("\\.{2,}" , ".").replaceAll("^[.]|[.]$", "");

		if(answer.length() > 15) {
			answer = answer.substring(0, 15);
		}
		
		if(answer.isEmpty()) {
			answer = "a";
		}
		
		answer = answer.replaceAll("[^\\w\\-_.]*", "").replaceAll("\\.{2,}" , ".").replaceAll("^[.]|[.]$", "");
		
		if(answer.length() < 3 && !answer.isEmpty()) {
			
			while(answer.length() < 3) {
				answer += answer.substring(answer.length()-1);
			}
			
		}
		
		
		System.out.println(answer);
		
	}

}


// \d 숫자  \\_-. *은 모든거 ? 