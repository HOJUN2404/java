//package JavaPractice;
//
//public class ch9_1103 {
//
//	public static void main(String[] args) {
//		// 11월 03일 매개변수의 다형성 예제를 실습하며 상속에 대해 제대로 이해하자 !! 
//		
//		Tv t = new Tv();
//		Computer c = new Computer();
//		
//		t.price = 300;
//		t.bonusPoint = 100;
//		
//		c.price = 1000;
//		c.bonusPoint = 200;
//		
//		Buyer b = new Buyer();
//		
//		b.buy(c);
//		b.buy(t);
//		
//		System.out.println(b.money);
//		System.out.println(b.bonusPoint);
//
//	}
//
//}
//
//
//
//class product {
//	int price;
//	int bonusPoint;
//}
//
//class Tv extends product {
//	
//	
//}
//
//class Computer extends product {
//	
//}
//
//class Buyer {
//	int money = 10000;
//	int bonusPoint = 0;
//	
//	void buy (Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy (Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy (product p) {
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//	}
//}
//
//
//
//
//
//
//
