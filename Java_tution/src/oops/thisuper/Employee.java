package oops.thisuper;

public class Employee {
	int id , salary;
	String name , desgn,orgname;

	public Employee() {
		System.out.println("Default Constructor : ");
	}
	public Employee(int id , int salary , String name) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id , int salary , String name , String desgn) {
		this(id, salary, name);
		this.desgn = desgn;
	}
	
	public Employee(int id , String name , String desgn , String orgname)
	{
		this.id = id;
		this.name = name;
		this.desgn = desgn;
		this.orgname = orgname;
	}
	
	public Employee(int id , int salary , String name , String desgn , String orgname) {
		this(id, salary, name, desgn);
		this.orgname = orgname;
		
	}
	public void dispdata() {
		System.out.println(id + " " + salary + " " + name + " " + desgn + " " + orgname);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,2000,"Virat","SE","GOOGLE");
		e1.dispdata();
	}
}
