package Constructor;

public class Student {

	int rno;
	String name;
	int std;
	
	Student(int rno,String name , int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	Student(int rno,String name) {
		this.rno = rno;
		this.name = name;
	}
	
	public void disp()
	{
		System.out.println("Rno: " + rno + " | Name : " + name + " | Std : " + std);
	}
	
}
