package JavaPractice;

public class ch12_1103_Interface {

	public static void main(String[] args) {
		// 
		
		Child3 c = new Child3();
		c.method2();
		c.method3();
		MyInterface.method4();

	}

}


class Child3 extends Parent3 implements MyInterface
{
	public void method1()
	{
		System.out.println("method1() in Child3");
	}
}

class Parent3
{
	public void method2()
	{
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface 
{
	default void method3()
	{
		System.out.println("method3() in MyInterface");
	}
	
	default void method2()
	{
		System.out.println("method2() in MyInterface");
	}
	
	static void method4()
	{
		System.out.println("static method2() in MyInterface");
	}
}