package JavaPractice;

import java.util.Scanner;

public class ch1 {
	// ���� �� for�� �����ϱ�
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// for�� 2741��
//		System.out.println("���� n�� �Է��ϼ��� : ");
//		int i = 1;
//		
//		int n = scanner.nextInt();
//
//		for(i=1 ; i<=n ; i++)
//		{
//			System.out.println(i);
//		}
//		
//		// for�� 2742��
//		for(i = n ; i > 0 ; i--)
//		{
//			System.out.println(n);
//			
//			n--;
//		}
		
		
		// for�� 11022��
		
		int a = scanner.nextInt();
		
		for (int i = 1 ; i <= a ; i++)
		{
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			System.out.println("Case #" + i + " : " + (b + c));
		}
		
		System.out.println("���� ����");
		scanner.close();
		
		
	}
	
	
	public static void ex2(String[] args) {
		
	}

}
