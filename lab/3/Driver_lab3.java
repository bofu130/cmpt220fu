/**
*file: Driver_lab3.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.4
*/
import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
  
    //System.out.print("Enter x1, y1, x2, y2, p: ");
    double x1, x2, y1, y2, p;
    x1 = input.nextDouble();
    if (x1 == 0) {
      break;
    }
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    p = input.nextDouble();

    double result = Math.pow((Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p)), 1/p);
    System.out.printf("%.10f\n",result);
    //isTrue = true;
    //return isTrue;
  
  
    }
  }
}