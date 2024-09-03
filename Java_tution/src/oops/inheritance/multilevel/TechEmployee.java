package oops.inheritance.multilevel;

import java.util.Scanner;

public class TechEmployee extends Employee {
	int salary;
	
	public void scandata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter orgname : ");
		orgname = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();		
	}
	
	public void dispdata() {
		System.out.println(id + " " + name + " " + dsgn + " " + orgname + " " + salary);
		
	}

}
