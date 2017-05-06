/**
*file: Exercises1_5.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_1
*due date: January 29
*version: 1.1
*/
import java.util.Scanner;

public class Exercises5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    double gratuityTotal;
    double total;
    gratuityTotal = subtotal * gratuityRate * 0.01;
    total = gratuityTotal + subtotal;
    System.out.print("The gratuity is $" + gratuityTotal + "and the total is $" + total);
  }
}