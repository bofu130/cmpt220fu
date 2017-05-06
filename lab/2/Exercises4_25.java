/**
*file: Exercises4_25.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_2
*due date: February 7
*version: 1.1
*/
public class Exercises4_25 {
  public static void main(String[] args) {
    //String s = " "; cannot work?
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      char characters = (char)(Math.random() * 26 + 'A');
      s.append(characters);
      }
    for (int i = 0; i < 4; i++) {
      char digit1 = (char)(Math.random() * 10 + '0');
      s.append(digit1);
      }
    System.out.print("Random vehicle plate number: " + s);
  }
}