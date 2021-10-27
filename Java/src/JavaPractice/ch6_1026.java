package JavaPractice;

public class ch6_1026 {

	public static void main(String[] args) {
		// 생성자를 이해해보자 !! 
		
		Point point1 = new Point(100, 200);
		Point point2 = new Point();
		Point3D point3 = new Point3D(400, 500, 600);
		
		System.out.println(point1.x);
		System.out.println(point2.x);
		System.out.println(point3.x);
		
	}
}

class Point
{
	int x = 10;
	int y = 10;
	
	Point()
	{
		
	}
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point
{
	int z;
	
	Point3D(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}
}