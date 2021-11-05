package JavaPractice;

public class ch8_1103 {

	public static void main(String[] args) {
		
		// 11월 03일 클래스를 이용하는 방법에 대해서 복습해봤다.... 안하면 자꾸 까먹어서 말이다... 
		
		
		
		dog d = new dog();
		cat c = new cat();
		
		d.scream();
		c.scream();
		
		d.scream("멍멍멍멍");
		
		System.out.println(c instanceof dog);
		System.out.println(d instanceof cat);
		

	}

}


class dog 
{
	void scream ()
	{
		System.out.println("멍멍");
	}
	
	void scream (String a)
	{
		System.out.println(a);
	}
}

class cat extends dog
{
	void scream()
	{
		System.out.println("야옹");
	}
}

