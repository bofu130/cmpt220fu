/**
*file: Exercises6_8.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_4
*due date: Feb 28
*version: 1.0
*/
public class Exercises6_8 {

public static void main(String args[]) {
  System.out.println("Celsiue     Fahrenheit     |    Fahrenheit        Celsiue");
  for (double celsius = 40.0, fahrenheit = 120.0; celsius > 30.0; celsius--, fahrenheit -= 10.0) {
	//System.out.printf("%.1f", celsius + "     " + "%.10f", fahrenheitToCelsius(fahrenheit) + "     " + "%.10f", fahrenheit + "     " + "%.10f", celsiusToFahrenheit(celsius));
    System.out.printf("\n%.1f", celsius);
	System.out.printf("         %.1f", celsiusToFahrenheit(celsius));
	System.out.printf("               %.1f", fahrenheit);
	System.out.printf("               %.1f", fahrenheitToCelsius(fahrenheit));
  }
  }
/** Convert from Celsius to Fahrenheit */
public static double celsiusToFahrenheit(double celsius) {
  return (9.0 / 5) * celsius + 32;
}


/** Convert from Fahrenheit to Celsius */
public static double fahrenheitToCelsius(double fahrenheit) {
  return (5.0 / 9) * (fahrenheit - 32);
  
}  
}
