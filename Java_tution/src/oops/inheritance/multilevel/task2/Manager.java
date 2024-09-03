package oops.inheritance.multilevel.task2;

public class Manager extends Employee{
	String department;
	
	public void manage() {
		System.out.println(name + " is managing the " + department + " department.");
	}

}
