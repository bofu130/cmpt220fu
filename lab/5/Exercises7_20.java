/**
*file: Exercises7_20.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: March 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises7_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] lists = new double[10];
    System.out.print("Enter 10 doubles: ");
    for (int k = 0; k < lists.length ; k++) {
      lists[k] = input.nextDouble();
    }
    for (int i = lists.length - 1; i >= 0; i--) {
      double currentMax = lists[i];
      int currentMaxIndex = i;
      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < lists[j]) {
          currentMax = lists[j];
          currentMaxIndex = j;
        }
      }
      if (currentMaxIndex != i) {
        lists[currentMaxIndex] = lists[i];
        lists[i] = currentMax;
      }
    }
    for (int l = 0; l < lists.length; l++) {
      System.out.print(lists[l] + " ");
    }
  }
}