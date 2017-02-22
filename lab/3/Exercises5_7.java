/**
*file: Exercises5_7.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_3
*due date: Feb 21
*version: 1.0
*/
public class Exercises5_7 {
  public static void main(String[] args) {
	//start at first year
	double tuation = 10000;
	int year = 1;
	double cost = 0;
	//for loop to calclulate the next 14 years tuition.
	for (year = 1; year <= 14; year++) {
		tuation = tuation * 1.05;
		//10th year
		if (year == 10) {
			System.out.println("The tuation of 10th year is: $" + tuation);
		}
		//11 to 14 years
		else if (year > 10) {
			cost += tuation;
		}
	}
	System.out.println("The total cost after the 10th years is: $" + cost);
  }
}