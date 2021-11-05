package JavaPractice;

public class ch10_1103 {

	public static void main(String[] args) {
		// Java의 정석 253 페이지 매개변수의 다형성 예제 실습
		
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());

	}

}





class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv1 extends Product 
{
	Tv1() 
	{
		super(100);
	}
	
	public String toString() 
	{
		return "Tv";
	}
}

class Computer1 extends Product 
{
	Computer1() 
	{
		super(200);
	}
	
	public String toString()
	{
		return "Computer";
	}
}

class Buyer 
{
	int money = 2000;
	int bonusPoint = 0;
	
	void buy (Product p)
	{
		if(money < p.price)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "를 구입했어 !!");
	}
	
}