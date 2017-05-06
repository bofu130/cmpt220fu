/**
*file: Exercises1_1.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_1
*due date: January 29
*version: 1.1
*/
import java.util.Scanner;

public class Exercises1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the degree in Celsius: ");
    double degreeInCelsius = input.nextDouble();
    double degreeInFahrenheit = (9.0 / 5.0) * degreeInCelsius + 32.0;
    System.out.print(degreeInCelsius + " Celsius is " + degreeInFahrenheit + " Fahrenheit.");
  }
}