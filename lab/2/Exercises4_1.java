/**
*file: Exercises4_1.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
import java.util.Scanner;
public class Exercises4_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a length from the center to a vertex: ");
    double radius = input.nextDouble();
    double s = 2 * radius * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
    System.out.printf("The area of the pentagon is %.2f", area);
  }
}