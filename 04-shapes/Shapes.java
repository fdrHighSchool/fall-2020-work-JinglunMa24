import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose one that you want the area/volume of\n1.Square\n2.Triangle\n3.Rectangle\n4.Circle\n5.Cube\n6.Triangular Prism\n7.Rectangular Prism\n8.Sphere");
    int chose = input.nextInt();

    if (chose == 1) {
      System.out.print("Enter the length: ");
      double side = input.nextDouble();
      System.out.println("Area of square is: " + square(side));
    } //close for square if

    else if (chose == 2) {
      System.out.println("Choose the way to calculate triangle.\n1.base and height\n2.3 lengths");
      int tAns = input.nextInt();
      if (tAns == 1) {
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        System.out.println("Area of the triangle is: " + triangle1(base,height));
      } //close for if tAns 1

      else if (tAns == 2) {
        System.out.print("Enter the first length: ");
        double len1 = input.nextDouble();
        System.out.print("Enter the second length: ");
        double len2 = input.nextDouble();
        System.out.print("Enter the third length: ");
        double len3 = input.nextDouble();
        System.out.println("Area of the triangle is: " + triangle2(len1, len2, len3));
      } //close for if tAns 2
    } //close for triangles if

    else if (chose == 3) {
      System.out.print("Enter the length: ");
      double len = input.nextDouble();
      System.out.print("Enter the width: ");
      double wid = input.nextDouble();
      System.out.println("Area of the rectangle is: " + rectangle(len,wid));
    } //end rectangle if

    else if (chose == 4) {
      System.out.print("Enter the radius: ");
      double r = input.nextDouble();
      System.out.println("Area of the circle is: " + circle(r));
    } //end circle if

    else if (chose == 5) {
      System.out.print("Enter the len: ");
      double len = input.nextDouble();
      double cubeV = square(len) * len;
      System.out.println("Volume of cube is: " + cubeV);
    } //end cube if

    if (chose == 6) {
      System.out.print("Enter the triangle base: ");
      double b = input.nextDouble();
      System.out.print("Enter the triangle height: ");
      double h = input.nextDouble();
      System.out.print("Enter the prism height: ");
      double l = input.nextDouble();
      double v = triangle1(b,h) * l;
      System.out.println("Volume of Triangular Prism is: " + v);
    } //end Triangular Prism if

    else if (chose == 7) {
      System.out.print("Enter the lenth: ");
      double len = input.nextDouble();
      System.out.print("Enter the width: ");
      double wid = input.nextDouble();
      System.out.print("Enter the height: ");
      double hei = input.nextDouble();
      double v = rectangle(len, wid) * hei;
      System.out.println("Volume of Rectangular Prism is: " + v);
    } //end Rectangular Prism if

    else if (chose == 8) {
      System.out.print("Enter the radius: ");
      double r = input.nextDouble();
      double v = ((double)4/3) * circle(r) * r;
      System.out.println("Volume of Sphere is: " + v);
    }

  } //close for main


  public static double square(double s){
    //side times side
    double sa = Math.pow(s,2);
    return sa;
  }//close square method

  public static double triangle1(double base, double height) {
    double t1a = (base * height)/2;
    return t1a;
  } //close for triangle1

  public static double triangle2(double len1, double len2, double len3) {
    double s = (len1 + len2 + len3)/2;
    double area = s * (s - len1) * (s - len2) * (s - len3);
    double t2a = Math.pow(area, 0.5);
    return t2a;
  } //close for triangle2

  public static double rectangle(double len, double wid) {
    double ra = len * wid;
    return ra;
  } //end rectangle

  public static double circle(double r) {
    double ca = Math.pow(r,2) * Math.PI;
    return ca;
  } //end circle


} //close for class
