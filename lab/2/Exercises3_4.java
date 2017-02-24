/**
*file: Exercises3_4.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
public class Exercises3_4 {
  public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 12 + 1);
	
	int month = randomNum % 12;
	
	String monthName = "";
	
	switch(month) {
	  case 1: monthName = "January";
	          break;
	  case 2: monthName = "February";
        	  break;
	  case 3: monthName = "March"; 
	          break;
	  case 4: monthName = "April"; 
	          break;
	  case 5: monthName = "May"; 
	          break;
	  case 6: monthName = "June"; 
	          break;
	  case 7: monthName = "July"; 
	          break;
	  case 8: monthName = "August"; 
	          break;
	  case 9: monthName = "September"; 
	          break;
	  case 10: monthName =  "October"; 
	           break;
	  case 11: monthName = "November"; 
	           break;
	  case 0: monthName = "December"; 
	           break;
	  
	  }	
	
	System.out.print("The month is " + monthName);
		
	}
}