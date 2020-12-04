import java.util.*;

public class Grades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many grades: ");
    int numGrades= input.nextInt();

    int grades[] = new int[numGrades];

    for (int i = 0; i < numGrades; i++) {
      System.out.print("Enter the grade: ");
      grades[i] = input.nextInt();
    } //end loop

    System.out.println(Arrays.toString(grades));
    System.out.println(getAverage(grades));
  } //end main

  public static double getAverage(int[] grades) {
    int sum = 0;
    for (int i = 0; i < grades.length; i++) {
      sum += grades[i];
    } //end loop
    return sum / grades.length;
  } //end getAverage

} //end class
