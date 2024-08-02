import java.util.Scanner;

public class char2 {
    public static void main (String args[])
    {
        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if(ch >=65 && ch<=90 )
        {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("Lowercase");
        }
        sc.close();
    }    
}
