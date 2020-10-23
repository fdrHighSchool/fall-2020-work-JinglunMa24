import java.util.*;

public class math {
  public static void main(String[] args) {
    cartesianDistance();
  }

  public static double cartesianDistance() {
    Scanner input = new Scanner(System.in);
    double x1, y1, x2, y2;
    System.out.print("Enter x for first point: ");
    x1 = input.nextInt();
    System.out.print("Enter y for first point: ");
    y1 = input.nextInt();
    System.out.print("Enter x for second point: ");
    x2 = input.nextInt();
    System.out.print("Enter y for second point: ");
    y2 = input.nextInt();
    double dis = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
    System.out.println("The distance between two points is: " + dis);
    return dis;
  }
}
