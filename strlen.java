import java.util.Scanner;

public class strlen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter your string");
    //     String s1 = sc.nextLine();

    //     int totallength = s1.length();


    //     System.out.println("Length = " + totallength);

    //     sc.close();
    // }
        
        System.out.println("Enter lower string");
        String s1 = sc.nextLine();

        String s2 = s1.toUpperCase();
        System.out.println("Upper String : " + s2);

        System.out.println("Enter Upper string");
        String s3 = sc.nextLine();

        String s4 = s3.toLowerCase();
        System.out.println("Lower String : " + s4);
        


    }

}
