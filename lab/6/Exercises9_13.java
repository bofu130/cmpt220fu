/**
*file: Exercises9_13.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_6
*due date: April 18
*version: 1.0
*/
import java.util.Scanner;
public class Exercises9_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    double array[][] = new double[rows][columns];
    System.out.println("Enter the array: ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    Location max = locateLargest(array);
    System.out.print("The location of the largest element is " + max.maxValue + " at (" + max.row + ", " + max.column + ")");
  }
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
}