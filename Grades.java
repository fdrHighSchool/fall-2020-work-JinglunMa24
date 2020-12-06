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
    System.out.println("The average of the grades is: " + getAverage(grades));
    System.out.println("The median of the grades is: " + getMedian(grades));
    System.out.println("The mode of the grades is: " + getMode(grades));
  } //end main

  public static double getAverage(int[] grades) {
    double sum = 0;

    for (int i = 0; i < grades.length; i++) {
      sum += grades[i];
    } //end loop

    return sum / grades.length;
  } //end getAverage()

  public static double getMedian(int[] grades) {
    Arrays.sort(grades);

    if (grades.length % 2 == 0) {
      double num1 = grades[grades.length / 2 - 1];
      double num2 = grades[grades.length / 2];
      return (num1 + num2) / 2;
    } //end if grades are even

    else {
      return grades[grades.length / 2];
    } //end else
  } //end getMedian()

  public static int getMode(int[] grades) {
    int num = 0;
    int count = 0;

    for (int i = 0; i < grades.length; i++) {
      int tempNum = grades[i];
      int tempCount = 0;
      for (int j = 0; i < grades.length; i++) {
        if (grades[i] == grades[j]) {
          tempCount++;
        } //end if grades index of "i" is the same as grades index of "j"
      } //end for loop for j
      if (tempCount > count) {
        num = tempNum;
        count = tempCount;
      } //end if count is > repeats
    } //end for loop for i
    return num;
  } //end getMode()

} //end class
