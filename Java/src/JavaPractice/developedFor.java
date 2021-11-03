package JavaPractice;

public class developedFor {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i<10 ; i++)
		{
			arr[i] = (int)(Math.random()*10);
		}
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		

	}

}
