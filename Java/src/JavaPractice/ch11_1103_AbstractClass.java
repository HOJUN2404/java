package JavaPractice;

public class ch11_1103_AbstractClass {

	public static void main(String[] args) {
		// [자바의 정석] 추상클래스 예제 실습
		
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		group[1].move(150, 150);
		
		for(int i = 0 ; i < group.length ; i++)
		{
			group[i].move(300, 300);
		}
		

	}

}


abstract class Unit 
{
	int x, y;
	abstract void move(int x, int y);
	
	void stop() 
	{
	
	}
}

class Marine extends Unit 
{
	void move(int x, int y)
	{
		System.out.println("Marine의 위치 [x = " + x + ", y = " + y + " ]");
	}
	
	void stimPack () 
	{
		
	}
}

class Tank extends Unit 
{
	void move(int x, int y)
	{
		System.out.println("Tank의 위치 [x = " + x + ", y = " + y + " ]");
	}
	
	void changeMode () 
	{
		
	}
}

class Dropship extends Unit 
{
	void move(int x, int y)
	{
		System.out.println("Dropship의 위치 [x = " + x + ", y = " + y + " ]");
	}
	
	void load () 
	{
		
	}
	
	void unload()
	{
		
	}
}



