/**
*file: Exercises5_13.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.1
*/
public class Exercises5_13 {
  public static void main(String[] args) {
    //start with 0
    int n = 0;
    //find the one which is the smallest n such that n^3 > 12000
    while (Math.pow(n, 3) < 12000) {
      n++;
    }
    //for that n - 1 is the Largest n such that n^3 < 12000
    int nLargest = n - 1;
    System.out.print("The largest n, for n^3 < 12000 is: " + nLargest);
  }
}