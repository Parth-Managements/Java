import java.util.Scanner;

public class substring {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 =sc.nextLine();
        String s2 = s1.substring(2,5);

        System.out.println("Substring = " + s2);




        sc.close();
    }
    
}
