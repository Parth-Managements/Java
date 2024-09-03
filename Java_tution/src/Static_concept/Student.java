package Static_concept;

import java.util.Scanner;

public class Student {

	int rno;
	String name;
	int std;
	static String schoolName;
	
	public static void setSchoolName(String schoolName)
	{
		Student.schoolName = schoolName;
	}
	
	public void scandata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Name : ");
		name = sc.nextLine();
		System.out.println(" Std : ");
		std = sc.nextInt();
	}
	
	public void dispdata()
	{
		System.out.println(rno + " " + name + " " + std + " " + schoolName);
	}
	
	public static void main(String[] args) {
		setSchoolName("DPS");
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.scandata();
		s2.scandata();
		s3.scandata();
		s4.scandata();
		s5.scandata();
		
		s1.dispdata();
		s2.dispdata();
		s3.dispdata();
		s4.dispdata();
		s5.dispdata();
		


	}

}
