/**
*file: Exercises10_17.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_7
*due date: April 25
*version: 1.0
*/
import java.math.BigInteger;
public class Exercises10_17 {
  public static void main(String[] args) {
    BigInteger i = new BigInteger(Long.MAX_VALUE + "");
    BigInteger end = i.add(new BigInteger("10"));
    for (i = new BigInteger(Long.MAX_VALUE + ""); i.compareTo(end) <= 0; i = i.add(new BigInteger("1"))) {
      System.out.println(i.multiply(i));
    }
  }
}