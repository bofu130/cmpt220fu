/**
*file: Exercises5_12.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.1
*/
public class Exercises5_12 {
  public static void main(String[] args) {
    //start with 0
    int n = 0;
    //for every n^2 <= 12000
    while (Math.pow(n, 2) <= 12000) {
      n++;
    }
    System.out.print("The smallest n, for n^2 >12000 is: " + n);
  }
}