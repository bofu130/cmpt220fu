import java.util.Scanner;

public class LabProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the following as percentage...");
	
	System.out.print("midterm exam: ");
	double midterm = input.nextDouble();
	
	System.out.print("final exam: ");
	double finalGrade = input.nextDouble();
	
	System.out.print("projects: ");
	double projects = input.nextDouble();
	
	System.out.print("homework and lab: ");
	double homework = input.nextDouble();
	
	double grade = ((midterm * 2 + finalGrade * 2 + projects * 2 + homework * 4) / 10);
	System.out.println("Your final grade is: " + grade + "%");
	}
}
	