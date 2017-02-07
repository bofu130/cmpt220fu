import java.util.Scanner;
public class Exercises4_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    double numberOfSide = input.nextDouble();
    System.out.print("Enter the side: ");
    double length = input.nextDouble();
    double area = (numberOfSide * length * length) / (4.0 * Math.tan(Math.PI / numberOfSide));
    System.out.print("The area of the polygon is " + area);
  }
}