/**
*file: Exercises5_1.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.1
*/
import java.util.Scanner;
public class Exercises5_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// get input
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num;
    int positive = 0;
    int negative = 0;	
    int sum = 0;
		num = input.nextInt();
        // Loop	to get count of number	
		do {
		  if (num > 0) {
			  positive ++;
		  }	
		  else if (num < 0) {
			  negative ++;
		  }
		  else {
			  System.out.println("No number are entered except 0.");
			  System.exit(1);
			
		}
		sum += num;
		num = input.nextInt();
		} while (num != 0);
		//output
		float count = positive + negative;
		float average = sum / count;
		System.out.println("The number of positive is: " + positive);
		System.out.println("The number of negative is: " + negative);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + average);
	}
}