/**
*file: Exercises7_32.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: March 28
*version: 1.0
*/
import java.util.Scanner;
public class Exercises7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list: ");
    int[] list = new int[6];
    for (int i = 0; i < 6; i++) {
      list[i] = input.nextInt();
    }
    partition(list);
    System.out.print("After the partition, the list is: ");
    for (int j = 0; j < list.length; j++) {
      System.out.print(list[j] + " ");
    }    
  }
  public static int partition(int[] list) {
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    int pivot = list[first];

    while (high > low) {
      while (low <= high && list[low] <= pivot) 
        low++;
      while (low <= high && list[high] > pivot)
        high--;
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }
    while (high >= low && list[high] >= pivot)
      high--;  
    if (high > first) {
      int temp = list[high];
      list[high] = list[first];
      list[first] = temp;
      return high;
    }
    else {
      return first;
    }
  }
}