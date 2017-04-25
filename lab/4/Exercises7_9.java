/**
*file: Exercises7_9.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: Feb 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises7_9 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  double[] myList = new double[10];
	  System.out.print("Enter Ten Numbers: ");
	  for (int i = 0; i < myList.length; i++) {
	    myList[i] = input.nextDouble();	
	  }
	  System.out.print("The minimum number is: " + min(myList));
  }
  public static double min(double[] array) {
	  double num = array[0];
	  for (int i = 0; i < 10; i++) {
	    if (num > array[i]) {
		  num = array[i];
	    }
	  }
	  return num;
  }
}