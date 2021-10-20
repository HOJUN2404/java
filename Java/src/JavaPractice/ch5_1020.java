package JavaPractice;



public class ch5_1020 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
				
		
	}

}

class Student{
	
	String name ;
	int ban ; 
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int total() {
		return (kor + eng + math);
	}
	
	float avg() {
		float tmp = (float)total() / 3; 
		
		return (Math.round(tmp*10f))/10f ;
	}
	
	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total() + ", " + avg();
	}
	
	
}
