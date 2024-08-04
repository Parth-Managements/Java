import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int len = 0;
        while (n1>0) {
            len++;
            n1 = n1/10;
        }
        System.out.println("Length = "+ len);
        sc.close();


    }
    
}
