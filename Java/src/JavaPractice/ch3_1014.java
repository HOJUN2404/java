package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_1014 {

	public static void main(String[] args) throws IOException {
		// 10�� 14�� Java�� ���� å�� ������ ������ �κ��� ���� �ǽ��غ��� ! ���� ���ص� ������ Ǯ�� ! 
		
		Scanner scn = new Scanner (System.in);
		
		
		//BufferReader�� ������ �������θ� �ν��ϰ� �����Ͱ� String���� �����Ǳ� ������ ����ȯ ���ִ� ������ ���� �� �ִ�.
		// ���� import �� ���׵� ������, Scanner ���ٴ� ������ !! 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// s�� ���� �Է¹��� ���� ������ �ִ�. 
		String s = br.readLine();
		
		// s�� ������ �������� �߶� �迭 Array �� �����Ѵ�.
		String Array[] = s.split(" ");
		
		System.out.println(Array[1]);
		
		int a1 = scn.nextInt();
		
		//���� ������ �������� �غ��� !! 
		String result = (a1 > 10 ? "Up" : "Down");
		System.out.println(result);
	}

}
