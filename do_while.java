
public class do_while {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 10;


        System.out.print(first);
        System.out.print(" " + second + " ");
        do {
            int next = first + second; 
            first = second; 
            second = next;
            System.out.print(next + " "); 
            n--;
        } while (n>0);
    }
}


