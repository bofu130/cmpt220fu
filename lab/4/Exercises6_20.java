/**
*file: Exercises6_20.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: Feb 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter something: ");
    String s = input.nextLine();
    System.out.print("The number of letters is: " + countLetters(s));
  }


public static int countLetters(String s) {
  return s.length();
  }
}