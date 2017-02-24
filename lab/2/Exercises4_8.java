/**
*file: Exercises4_8.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
import java.util.Scanner;
public class Exercises4_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int number = input.nextInt();
    System.out.println("The character for ASCII code " + number + " is " + (char) number);
  }
}