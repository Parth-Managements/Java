package oops.inheritance.simple;

import java.util.Scanner;

public class Employee extends Person{

	int id,salary;
	String dsgn, orgname;
	
	public void scandata() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter id : ");
	    id = sc.nextInt();
	    sc.nextLine();  // Consume the leftover newline character

	    System.out.println("Enter name : ");
	    name = sc.nextLine();

	    System.out.println("Enter dsgn : ");
	    dsgn = sc.nextLine();

	    System.out.println("Enter orgname : ");
	    orgname = sc.nextLine();

	    System.out.println("Enter salary : ");
	    salary = sc.nextInt();
	}

	
	public void dispdata() {
		System.out.println(id + " " +  name + " " +  dsgn + " " +  orgname + " " + salary);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.scandata();
		e2.scandata();

		e1.dispdata();
		e2.dispdata();

	}

}
