package JavaPractice;

public class ch8_1103 {

	public static void main(String[] args) {
		
		// 11�� 03�� Ŭ������ �̿��ϴ� ����� ���ؼ� �����غô�.... ���ϸ� �ڲ� ��Ծ ���̴�... 
		
		
		
		dog d = new dog();
		cat c = new cat();
		
		d.scream();
		c.scream();
		
		d.scream("�۸۸۸�");
		
		System.out.println(c instanceof dog);
		System.out.println(d instanceof cat);
		

	}

}


class dog 
{
	void scream ()
	{
		System.out.println("�۸�");
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
		System.out.println("�߿�");
	}
}

