/**
*file: Driver_prj1.java
*author: Bo Fu
*course: CMPT220
*assignment: Project 1
*due date: March 28
*version: 1.0
*/
import java.util.Scanner;
public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idx1 = input.nextInt();
    int idx2 = input.nextInt();
    int[] vFirst = new int[idx1];
    int[] vSecond = new int[idx2];
    int resLength = (vFirst.length + vSecond.length) - 1;
    int[] cResult = new int[resLength];
    for (int h = 0; h < resLength; h++) {
      cResult[h] = 0;
    }
    for (int i = 0; i < idx1; i++) {
      vFirst[i] = input.nextInt();  
    }
    for (int j = 0; j < idx2; j++) {
      vSecond[j] = input.nextInt();
    }
    for (int idx = 0; idx < resLength; idx++) {
      for (int shift = 0; shift < idx1; shift++) {
        if (idx - shift >= 0 && idx - shift <= idx1 - 1) {
          cResult[idx] += vFirst[idx - shift] * vSecond[shift];
        }
      }
    }
    for (int k = 0; k < resLength; k++) {
      System.out.print(cResult[k] + " ");
    }
  }
}