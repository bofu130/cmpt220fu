/**
*file: Exercises7_18.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: Feb 28
*version: 1.1
*/
import java.util.Scanner;
public class Exercises7_18 {
  //public static double[] myList = new double[10];
  public static void main (String[] args) {
    double[] myList = new double[10];
    Scanner input = new Scanner(System.in);
	  System.out.print("Enter 10 numbers: ");
	  for (int i = 0; i < 10; i++) {
      myList[i] = input.nextDouble();
	  }
    bubble(myList);
    for (int k  = 0; k < 10; k++) {
      System.out.print(myList[k] + " ");
	  }	
  }
  public static void bubble(double[] array) {
    double temNum = 0;
	  int j;
    for (int k = 0; k < array.length; k++) {
	    for (j = 0; j < 9; j++) {
        if (array[j] > array[j + 1]) {
          temNum = array[j];
		      array[j] = array[j + 1];
		      array[j + 1] = temNum;
	  }
    }
	}
  }
}