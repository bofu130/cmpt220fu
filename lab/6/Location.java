/**
*file: Location.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_6
*due date: April 18
*version: 1.0
*/
public class Location {
  int row;
  int column;
  double maxValue;
  Location(double[][] a) {
    maxValue = 0;
    row = 0;
    column = 0;
    for (int i = 0; i < a.length; i ++) {
      for (int j = 0; j < a[i].length; j++) {
        if(a[i][j] > maxValue) {
          maxValue = a[i][j];
          row = i;
          column = j;
        }
      }
    }
  
  }
}