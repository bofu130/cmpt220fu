/**
*file: Exercises6_3.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.3
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome 
public static boolean isPalindrome(int number) 
*/
import java.util.Scanner;
public class Exercises6_3 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter an integer: ");
	  int number = input.nextInt();
    if (isPalindrome(number)) {
      System.out.println(number + " is a palindrome. reverse: " + reverse(number));
    } 
	  else {
      System.out.println(number + " is NOT a palindrome. reverse: " + reverse(number));

    }
  }
    public static int reverse(int number) {
	    int reverse = 0;
	    double dig = 0.0;
	    // get the three digit and reverse it order.
	    int firNum = number/100;
	    int secNum = (number % 100) / 10;
	    int thrNum = number % 10;
	    reverse = reverse + firNum + secNum * 10 + thrNum * 100;
	    return reverse;  
    }
	
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
		  return true;
		}
    else{
			return false;
		}		  
	
  }
}
