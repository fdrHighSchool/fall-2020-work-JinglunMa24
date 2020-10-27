import java.util.*;

public class distance {
  public static void main(String[] args) {

    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("Choose.\n1.Cartesian Distance\n2.Taxi cab Distance\n3.Fine the Max\n4.Stop");
      int chose = input.nextInt();
      if (chose == 1) {
        cartesianDistance();
      } //end chose 1
      else if (chose == 2) {
        taxicabDistance();
      } //end chose 2
      else if (chose == 3) {
        max();
      } //end chose 3
      else {
        break;
      } //end chose 4
    } //end while loop
  } //end main

  public static void cartesianDistance() {
    Scanner input = new Scanner(System.in);
    String p1, p2;
    int x1, x2, y1, y2;
    System.out.print("Enter point 1: ");
    p1 = input.nextLine();
    System.out.print("Enter point 2: ");
    p2 = input.nextLine();
    x1 = getX(p1);
    x2 = getX(p2);
    y1 = getY(p1);
    y2 = getY(p2);
    double dis = Math.sqrt(Math.pow((double)x2 - (double)x1 , 2) + Math.pow((double)y2 - (double)y1 , 2));
    System.out.println("The distance between two points is: " + dis);
  } //end cartesianDistance()

  public static void taxicabDistance() {
    Scanner input = new Scanner(System.in);
    String p1, p2;
    int x1, x2, y1, y2;
    System.out.print("Enter the first point on the map: ");
    p1 = input.nextLine();
    System.out.print("Enter the second point on the map: ");
    p2 = input.nextLine();
    x1 = getX(p1);
    x2 = getX(p2);
    y1 = getY(p1);
    y2 = getY(p2);
    int dis = Math.abs(x1 - x2) + Math.abs(y1 - y2);
    System.out.println("The taxicab distance between two points is: " + dis);
  } //end taxicabDistance()

  public static void max() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the numbers that you are finding the max with: ");
    int num= input.nextInt();
    List<Double> nums = new ArrayList<Double>();
    for (int i = 0; i < num; i++) {
      System.out.print("Enter the value: ");
      double values = input.nextDouble();
      nums.add(values);
    } //end for loop
    System.out.println("The max numbers is: " + Collections.max(nums));
  } //end max()

  public static int getX(String point) {
    int comma = point.indexOf(",");
    String x = point.substring(1, comma);
    //System.out.println(x);
    return Integer.parseInt(x);
  } //end getX

  public static int getY(String point) {
    int comma = point.indexOf(",");
    String y = point.substring(comma + 1, point.length() - 1);
    //System.out.println(y);
    return Integer.parseInt(y);
  } //end getY
} //end class
