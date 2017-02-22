/**
*file: Driver_lab3.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.0
*/
public class Driver_lab3 {
  public static void main(String[] args) {
    double x1, x2, y1, y2, p;
	x1 = 1.0;
	x2 = 1.0;
	y1 = 2.0;
	y2 = 2.0;
	p = 2.0;
    double result = Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1/p);
    System.out.printf("%.4f",result);
  } 
}