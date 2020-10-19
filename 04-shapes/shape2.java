import java.util.*;

public class shape2 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Chose the shape that you want to calculate of the area. (square, rectangle)");
    String chose = input.next();

    if ("square".equals(chose)) {
      System.out.println("Tell me the length of the square. ");
      double len = input.nextDouble();
      square(len);
    } //close for square if

    else if("rectangle".equals(chose)) {
      System.out.println("Tell me the length of the rectangle ");
      double len = input.nextDouble();
      System.out.println("Tell me the width of the rectangle ");
      double wid = input.nextDouble();
      rectangle(len,wid);
    } //close for rectangle if

    else {
      System.out.println("Sorry. Can't identify the shape you entered.");
    } //close for else
  } //close for main

  public static void square(double len) {
    for (int row = 0; row < len; row++) {
      for (int col = 0; col < len; col++) {
        System.out.print("* ");
      } //close for col
    System.out.println();
    } //close for row
    double area = Math.pow(len,2);
    System.out.println("The area of square is: " + area);
  } //close for sqaure

  public static void rectangle(double len, double wid) {
    for (int row = 0; row < wid; row++) {
      for (int col = 0; col < len; col++) {
        System.out.print("* ");
      } //close for col
    System.out.println();
    } //close for row
    double area = len * wid;
    System.out.println("The area of rectangle is: " + area);
  } //close for rectangle

} //close for class shape2
