/**
*file: Exercises7_9.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: Feb 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises7_18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	double[] myList = new double[10];
	
	System.out.print("Enter Ten Numbers: ");
	for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextDouble();
	}
	bubble(myList);
	//System.out.print("The number in order is: " + bubble(myList));
  }
  public static double bubble(double[] array) {
    double num = 0;
	String s = " ";
	int j = 0;
	for (j = 0; j < 9; j++) {
      if (array[j] > array[j + 1]) {
        num = array[j];
		array[j] = array[j + 1];
		array[j] = num;
		System.out.println(array[j]);
	  }
	}
    for (j = 0; j < 10; j++) {
      s = s + array[j] + " ";
	}
	System.out.print(s);
	return array[0];
  }
}