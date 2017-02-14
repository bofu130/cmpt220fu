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
	System.out.println("The number you enter is: " + num);
	String number = String.format(randomNum1 + " " + randomNum2 + " " + randomNum3);
	System.out.println("The number random generate is: " + number);
	
	int prize = 0;
	
	if (num1 == randomNum1) {
	  if (num2 == randomNum2 && num3 == randomNum3) {
		prize = 1;
	  }
	  else if (num2 == randomNum3 && num3 == randomNum2) {
		  prize = 2;
	  }
	  else {
		  prize = 3;
	  }
	}
	else if (num1 == randomNum2) {
		if (num2 == randomNum1 && num3 == randomNum3) {
			prize = 2;
		}
		else if (num2 == randomNum3 && num3 == randomNum1) {
			prize = 2;
		}
		else {
			prize = 3;
		}
	}	
	else if (num1 == randomNum3) {
		if (num2 == randomNum1 && num3 == randomNum2) {
			prize = 2;
		}
		else if (num2 == randomNum2 && num3 == randomNum1) {
			prize = 2;
		}
		else {
			prize = 3;
		}
	}
	else if (num2 == randomNum1) {
		if (num1 == randomNum2 && num3 == randomNum3) {
			prize = 2;
		}
		else if (num1 == randomNum3 && num3 == randomNum2) {
			prize = 2;
		}
		else {
			prize = 1;
		}
	}
	else if (num2 == randomNum2) {
		if (num1 == randomNum3 && num3 == randomNum1) {
			prize = 2;
		}
		else {
			prize = 1;
		}
	}
    else if (num2 == randomNum3) {
		if (num1 == randomNum1 && num3 == randomNum2) {
			prize = 2;
		}
		else if (num1 == randomNum2 && num3 == randomNum1) {
			prize = 2;
		}
		else {
			prize = 1;
		}	
	}
    else if (num3 == randomNum1) {
		if (num1 == randomNum2 && num2 == randomNum3) {
			prize = 2;
		}
		else if (num1 == randomNum2 && num2 == randomNum3) {
			prize = 2;
		}
		else {
			prize = 1;
		}
	}
    else if (num3 == randomNum2) {
		if (num1 == randomNum2 && num2 == randomNum1) {
			prize = 2;
		}
		else {
			prize = 1;
		}		
	}
	else if (num3 == randomNum3) {
		if (num1 == randomNum2 && num2 == randomNum3) {
			prize = 2;
		}
		else if (num1 == randomNum3 && num2 == randomNum2) {
			prize = 2;
		}
		else {
			prize = 1;
		}
	}
	else {
		prize = 0;
	}
	
    switch (prize) {
		case 1: System.out.print("You have win $10,000!");
		        break;
		case 2: System.out.print("You have win $3,000!");
		        break;
		case 3: System.out.print("You have win $1,000!");
		        break;
		case 0: System.out.print("You have win nothing!");
		break;
		
	}
  }	
}		