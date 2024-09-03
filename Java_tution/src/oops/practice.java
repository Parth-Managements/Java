package oops;

class Employee
{
	private int rno;
	private int std;
	private String name;
	
	public void set(String name , int rno,int std)
	{
		this.name = name; 
		this.rno = rno;
		this.std = std;
	}
	public void get()
	{
		System.out.println(name);
		System.out.println(rno);
		System.out.println(std);
	}
};

public class practice {
	public static void main(String[] args) {
		Employee n1 = new Employee();
		n1.set("Virat", 1, 18);
		n1.get();

	}

}
