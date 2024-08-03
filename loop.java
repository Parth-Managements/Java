import java.util.Scanner;

public class loop {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even numbers:" + i);
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
        sc.close();

    }
}
