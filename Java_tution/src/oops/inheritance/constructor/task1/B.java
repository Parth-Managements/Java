package oops.inheritance.constructor.task1;

public class B extends A{
	int no2;
	
	public B() {
		no2 = 20;
		System.out.println("B() : 	no2 : " + no2);
	}
	public B(int no1 , int no2) {
		super(no1);
		this.no2 = no2;
		System.out.println("B() : 	no2 : " + no2);
	}
	
	public static void main(String[] args) {
		B obj = new B(10,20);
	}
}
