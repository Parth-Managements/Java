import java.util.Scanner;

public class simpleif {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        // int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " is Maximum");
            }
        }

        if (n2 > n1) {
            if (n2 > n3) {
                System.out.println(n2 + " is Maximum");
            }
        }

        if (n3 > n1) {
            if (n3 > n2) {
                System.out.println(n3 + " is Maximum");
            }
        }

        // if(n>0)
        // {
        // System.out.println("Number is positive");
        // }
        // if(n<0)
        // {
        // System.out.println("Number is negative");
        // }
        // if(n==0)
        // {
        // System.out.println("Number is zero");
        // }
        sc.close();
    }

}
