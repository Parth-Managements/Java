package oops;

public class Student {

	int rno;
	String name = new String();
	int std;
	
	Student()
	{
		System.out.println("START :: Default Constructor" + this);
		rno = 12;
		name = "Virat";
		std = 5;
		System.out.println("END :: Default Constructor");
	}

}
