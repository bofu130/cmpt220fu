/**
*file: Exercises10_10.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_7
*due date: April 25
*version: 1.0
*/
public class Exercises10_10 {
  public static void main(String[] args) {
    Queue queue = new Queue();
    for (int i = 0; i < 20; i++) {
      queue.enqueue(i);
    }
    while (queue.length != 0) {
      System.out.print(queue.dequeue());
    }
  }
}