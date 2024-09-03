package oops;

public class Student
{
	int rno ;
	String name = new String();
	int std ;
	
	Student()
	{
		System.out.println("START :: Default Constructor----"+this);
		
		rno = 1;
		name = "Virat";
		std = 12;
		System.out.println("EXIT :: Default Constructor----");	
	}
		
}