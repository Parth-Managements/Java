package oops.thisuper;

public class TechEmployee extends Employee{
	int salary;
	
	public TechEmployee(int id , int salary , String name , String desgn,  String orgname ) {
		super(id,name,desgn,orgname);
		super.salary = salary;
	}
	public void dispdata() {
		System.out.println(id + " " + salary + " " + name + " " + desgn + " " + orgname);
	}
	public static void main(String[] args) {
		TechEmployee e1 = new TechEmployee(1,2000 , "Virat", "SE", "GOOGLE");
		e1.dispdata();
		
	}

}
