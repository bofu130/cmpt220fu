/**
*file: Exercises7_31.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: March 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list1 = new int[6];
    System.out.print("Enter list1: ");
    for (int k = 0; k < list1.length ; k++) {
			list1[k] = input.nextInt();
    }
    int[] list2 = new int[5];
    System.out.print("Enter list2: ");
    for (int k = 0; k < list2.length ; k++) {
			list2[k] = input.nextInt();
    }
    int[] list3 = merge(list1, list2);
    for (int m = 0; m < list3.length; m++) {
      int temNum = 0;
      for (int n = 0; n < list3.length - 1; n++) {
        if (list3[n] > list3[n + 1]) {
          temNum = list3[n];
		      list3[n] = list3[n + 1];
		      list3[n + 1] = temNum;
	        }
        }
	    }
    for (int l = 0; l < list3.length; l++) {
      System.out.print(list3[l] + " ");
    }
  }  

  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];
    for (int i = 0; i < list1.length; i++) {
      list3[i] = list1[i];
    }
    for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
      list3[j] = list2[i];
    }
    return list3;
  }
}