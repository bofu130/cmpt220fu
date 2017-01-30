import java.util.Scanner;

public class Exercises6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	
	int fir = input.nextInt();
	int sec = fir % 10;
	int secDigit = fir / 10;
	int thi = secDigit % 10;
	int thiDigit = fir / 100;
	int fou = thiDigit % 10;
	
	int total = sec + thi + fou;
	System.out.println("The sum of the digits is " + total);
	}
}
  