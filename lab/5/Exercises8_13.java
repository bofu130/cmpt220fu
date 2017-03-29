/**
*file: Exercises8_13.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: March 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises8_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns of the array: ");
    int i = input.nextInt();
    int j = input.nextInt();
    double[][] matrix1 = new double[i][j];
    System.out.print("Enter the array: ");
    for (int k = 0; k < i; k++) {
      for (int l = 0; l < j; l++) {
        matrix1[k][l] = input.nextDouble();
      }
    }
    int[] largestNum = locateLargest(matrix1);
    System.out.print("Largest element is at: (" + largestNum[0] + ", " + largestNum[1] + ")");
  }
  
  public static int[] locateLargest(double[][] a) {
    int[] largestNum = new int[] {0, 0};
    double largest = a[0][0];
    for (int m = 0; m < a.length; m++) {
      for (int n = 0; n < a[m].length; n++) {
        if (a[m][n] > largest) {
          largestNum[0] = m;
          largestNum[1] = n;
          largest = a[m][n];
        }
      }
    }
    return largestNum;
  }
}