import java.util.Scanner;

public class Exercises5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and a gratuity rate: ");
	
	double subtotal = input.nextDouble();
	double gratuityRate = input.nextDouble();
	double gratuityTotal;
	double total;
	
	gratuityTotal = subtotal * gratuityRate * 0.01;
	total = gratuityTotal + subtotal;
	
	System.out.print("The gratuity is $" + gratuityTotal + "and the total is $" + total);
	}
}