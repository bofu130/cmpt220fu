/**
*file: Exercises6_2.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.1
*/
import java.util.Scanner;
public class Exercises6_2 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter an integer: ");
	  long num = input.nextLong();
	  System.out.println("The sum of the three integers " + num + " is " + sumDigits(num));
  }
  public static long sumDigits(long n) {
	  int sum = 0;
	  while (n > 0) {
      sum += n % 10;
	    n /= 10;
	}
    return sum;  
  }
}