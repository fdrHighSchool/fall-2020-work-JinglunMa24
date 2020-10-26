import java.util.*;

public class math {
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
    double x1, y1, x2, y2, dis;
    System.out.print("Enter x for first point: ");
    x1 = input.nextInt();
    System.out.print("Enter y for first point: ");
    y1 = input.nextInt();
    System.out.print("Enter x for second point: ");
    x2 = input.nextInt();
    System.out.print("Enter y for second point: ");
    y2 = input.nextInt();
    dis = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
    System.out.println("The distance between two points is: " + dis);
  } //end cartesianDistance()

  public static void taxicabDistance() {
    Scanner input = new Scanner(System.in);
    double xA, xB, yA, yB, dis;
    System.out.print("Enter the first x value on the map: ");
    xA = input.nextDouble();
    System.out.print("Enter the second x value on the map: ");
    xB = input.nextDouble();
    System.out.print("Enter the first y value on the map: ");
    yA = input.nextDouble();
    System.out.print("Enter the second y value on the map: ");
    yB = input.nextDouble();
    dis = Math.abs(xA - xB) + Math.abs(yA - yB);
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

} //end class
