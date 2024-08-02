import java.util.Scanner;





public class hello {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int prime = 2;
		int count = 0;
		while (count != n) {
			int sum = 0;
			for (int i = 1; i <= prime; i++) {
				if (prime % i == 0) {
					sum++;
				}
			}
			if (sum == 2) {
				System.out.println(prime);
				prime++;
				count++;
			} else {
				prime++;
			}
		}

		sc.close();
	}
}
