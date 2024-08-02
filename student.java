import java.util.Scanner;

public class student {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int avg = (sub1 + sub2 + sub3 + sub4 + sub5 )/5;
        System.out.println("Average = " + avg);

        if(avg < 100 && avg >=90)
        {
            System.out.println("Your Grade is A");
        }
        else if (avg < 90 && avg>=80)
        {
            System.out.println("Your Grade is B");
        }
        else if (avg < 80 && avg>=70)
        {
            System.out.println("Your Grades is C");
        }
        else if (avg < 70 && avg>=60)
        {
            System.out.println("Your Grades is D");
        }
        else if (avg < 60 && avg >=50)
        {
            System.out.println("Your Grade is E");
        }
        else
        {
            System.out.println("You are Fail");
        }
        sc.close();
        
    }
    
}
