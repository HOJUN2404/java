package programmers;

import java.time.LocalDate;
import java.util.Scanner;

public class year2016 {

	public static void main(String[] args) {
		// 프로그래머스 1단계 2016년 문제
		
		Scanner scn = new Scanner(System.in);
//		Date date = new Date();
//		
		int a = scn.nextInt();
		int b = scn.nextInt();
//		
//		date.setYear(2016);
//		date.setMonth(a-1);
//		date.setDate(b);
//		
//		int days = date.getDay();
//		
//		System.out.println(days);
//		
//		String[] dat1 = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
//		
//		System.out.println(dat1[days]);
//		
//		for(int i = 1 ; i < a+1 ; i++) {
//			if(i%2 == 0) {
//				date += 31;
//			}
//			else {
//				date += 30;
//			}
//		}
		System.out.println(LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3));
		
	}


	
	
}
