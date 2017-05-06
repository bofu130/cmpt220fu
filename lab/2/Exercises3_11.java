/**
*file: Exercises3_11.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
import java.util.Scanner;
public class Exercises3_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number of month: ");
    int month = input.nextInt();
    System.out.print("Enter a number of year: ");
    int year = input.nextInt();
    String dayNumber = "";
    String monthName = "";
    switch (month) {
      case 1:
        monthName = "January";
        dayNumber = "31";
          break;
      case 2:
        monthName = "February";
        if (year % 4 == 0) {
           dayNumber  = "29";
        }
        else {
          dayNumber = "28";
        }
        break;
      case 3:
        monthName = "March";
        dayNumber = "31";
        break;
      case 4:
        monthName = "April";
        dayNumber = "30";
        break;
      case 5:
        monthName = "May";
        dayNumber = "31";
        break;
      case 6:
        monthName = "June";
        dayNumber = "30";
        break;
      case 7:
        monthName = "July";
        dayNumber = "31";
        break;
      case 8:
        monthName = "August";
        dayNumber = "31";
        break;
      case 9:
        monthName = "September";
        dayNumber = "30";
        break;
      case 10:
        monthName = "October";
        dayNumber = "31";
        break;
      case 11:
        monthName = "November";
        dayNumber = "30";
        break;
      case 12:
        monthName = "December";
        dayNumber = "31";
        break;
    }
    System.out.println(monthName + " in " + year + " has " + dayNumber + " days.");
  }
}