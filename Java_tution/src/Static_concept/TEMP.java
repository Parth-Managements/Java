package Static_concept;
import java.util.Scanner;

public class TEMP {

	public static void main(String[] args) {
        System.out.println("Enter the Character:-");
        Scanner sc = new Scanner(System.in);
        String let = sc.nextLine();
        int count = 0;
        int count2 = 0;
        for(int i=0;i<let.length();i++)
        {
        	if(let.charAt(i) == 'a' || let.charAt(i)=='e'||let.charAt(i)=='i'||let.charAt(i)=='o'||let.charAt(i)=='u')
        	{
        		count++;
        	}
        	else {
				count2++;
			}
        }

        System.out.println("No of vowels -->"+count);
        System.out.println("no of consonants -->"+count2);

	}

}
