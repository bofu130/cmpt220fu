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
	String grade = " ";
	double gradeNum = ((midterm * 2 + finalGrade * 2 + projects * 2 + homework * 4) / 10);
	if (gradeNum >= 95) {
      grade = "A";
	}
	else if (gradeNum < 95 && gradeNum >= 90) {
		grade = "A-";
	}
	else if (gradeNum < 90 && gradeNum >= 87) {
		grade = "B+";
	}
	else if (gradeNum < 87 && gradeNum >= 83) {
		grade = "B";
	}
	else if (gradeNum < 83 && gradeNum >= 80) {
		grade = "B-";
	}
	else if (gradeNum < 80 && gradeNum >= 77) {
	    grade = "C+";
	}
	else if (gradeNum < 77 && gradeNum >= 73) {
		grade = "C";
	}
	else if (gradeNum < 73 && gradeNum >= 70) {
		grade = "C-";
	}
	else if (gradeNum < 70 && gradeNum >= 65) {
		grade = "D+";
	}
	else if (gradeNum < 65 && gradeNum >= 60) {
		grade = "D";
	}
	else {
		grade = "F";
	}
	System.out.print("Your final grade is: " + grade);
	}
}