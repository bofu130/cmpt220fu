/**
*file: Rectangle.java
*author: Bo Fu
*course: CMPT220
*assignment: lab_6
*due date: April 18
*version: 1.0
*/
public class Rectangle {
  double width;
  double height;
  Rectangle() {
    width = 1.0;
    height = 1.0;
  }
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  double getArea() {
    double area;
    return area = width * height;
  }
  double getPerimeter() {
    double perimeter;
    return perimeter = 2 * (width + height);
  }
}