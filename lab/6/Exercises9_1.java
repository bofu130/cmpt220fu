/**
*file: Exercises9_1.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_5
*due date: April 18
*version: 1.0
*/
public class Exercises9_1 {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(4, 40);
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("The width of the rectangle 1 is: " + rectangle1.width);
    System.out.println("The height of the rectangle 1 is: " + rectangle1.height);
    System.out.println("The area of the rectangle 1 is: " + rectangle1.getArea());
    System.out.println("The perimeter of the rectangle 1 is: " + rectangle1.getPerimeter());
    System.out.println("\nThe width of the rectangle 2 is: " + rectangle2.width);
    System.out.println("The height of the rectangle 2 is: " + rectangle2.height);
    System.out.println("The area of the rectangle 2 is: " + rectangle2.getArea());
    System.out.println("The perimeter of the rectangle 2 is: " + rectangle2.getPerimeter());
  }
}