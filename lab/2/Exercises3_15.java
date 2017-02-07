import java.util.Scanner;
public class Exercises3_15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Please Enter Three Integers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int randomNum1 = (int)(Math.random() * 10);
	int randomNum2 = (int)(Math.random() * 10);
	int randomNum3 = (int)(Math.random() * 10);
	
	String num = String.format(num1 + " " + num2 + " " + num3);
	System.out.print(num);
	String number = String.format(randomNum1 + " " + randomNum2 + " " + randomNum3);
	System.out.print(number);
	
	
	switch (num1) {
	  case randomNum1:
	    if (num2 == randomNum2 && num3 == randomNum3) {
		  System.out.print("You have win $10,000!");
		}
		else if (num2 == randomNum3 && num3 == randomNum2) {
			System.out.print("You have win $3,000!");
		}
        else {
			System.out.print("You have win $1,000!");
		}
		break;
	  case randomNum2:
        if (num2 == randomNum1 && num3 == randomNum3) {
          System.out.print("You have win $3,000!");
        }
        else if (num2 == randomNum3 && num3 == randomNum1) {
          System.out.print("You have win $3,000!");
        }
        else {
          System.out.print("You have win $1,000!");
        }
        break;
      case randomNum3:
        if (num2 == randomNum1 && num3 == randomNum2) {
          System.out.print("You have win $3,000!");
		}
        else if (num2 == randomNum2 && num3 == randomNum1) {
          System.out.print("You have win $3,000!");
		}
        else {
          System.out.print("You have win $1,000!");
		}
		break;
      default:
        System.out.print("You have win nothing!");
        break;		
	}
  }
}