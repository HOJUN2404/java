package programmers;

import java.util.Scanner;

public class NewIdRecomend {

	public static void main(String[] args) {
		// ���α׷��ӽ� 1�ܰ� - �ű� ���̵� ��õ
		
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


// \d ����  \\_-. *�� ���� ? 