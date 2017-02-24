/**
*file: Exercises3_8.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
import java.util.Scanner;
public class Exercises3_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Please Enter Three Integers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	if (num1 > num2) {
	  if (num2 > num3) {
	    System.out.println("Number is " + num3 + " " + num2 + " " + num1);
	    }
	  }
    else if (num1 > num3 && num3 > num2) {
        System.out.println("Number is " + num2 + " " + num3 + " " + num1);
	  }
    else if (num2 > num1 && num1 > num3) {
        System.out.println("Number is " + num3 + " " + num1 + " " + num2);
	  }
    else if (num2 > num3 && num3 > num1) {
        System.out.println("Number is " + num1 + " " + num3 + " " + num2);
	  }
	else if (num3 > num2 && num2 > num1) {
        System.out.println("Number is " + num1 + " " + num2 + " " + num3);
	  }
    else if (num3 > num1 && num1 > num2) {
        System.out.println("Number is " + num2 + " " + num1 + " " + num3);
	  }
    }
}	