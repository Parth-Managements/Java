package oops.thisuper;

public class Student {
	int rno;
	String name;
	int std;
	
	public Student()
	{
		
	}
	public Student(int rno , String name , int std)
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		
	}
	public void dispdata() {
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args) {
		Student student = new Student(1,"Virat",12);
		student.dispdata();
	}

}
