import java.util.*;

public class Grades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //input scanner
    System.out.print("Enter how many grades: "); //ask user number of grades
    int numGrades= input.nextInt(); //set numGrades as the input

    int grades[] = new int[numGrades]; //set a list as the numGrades

    for (int i = 0; i < numGrades; i++) { //for loop to store in multiple inputs
      System.out.print("Enter the grade: "); //ask user the grade
      grades[i] = input.nextInt(); //store the grades into the grades list
    } //end loop

    System.out.println(Arrays.toString(grades)); //print out the list
    System.out.println("The average of the grades is: " + getAverage(grades)); //print out the average
    System.out.println("The median of the grades is: " + getMedian(grades)); //print out the median
    System.out.println("The mode of the grades is: " + getMode(grades)); //print out the mode
  } //end main

  // Name: getAverage()
  // Purpose: get mean of the list
  // Input: list of the grades
  // Return: the average of the grades
  public static double getAverage(int[] grades) {
    double sum = 0; //set a sum

    for (int i = 0; i < grades.length; i++) { //for loop to add up all the terms in the list
      sum += grades[i]; //add them up into sum
    } //end loop

    return sum / grades.length; //return the result
  } //end getAverage()

  // Name: getMedian()
  // Purpose: get the median of the list
  // Iuput: list of the grades
  // Return: the median of the grades
  public static double getMedian(int[] grades) {
    Arrays.sort(grades); //sort the grades list from smallest to greatest

    if (grades.length % 2 == 0) { //if the number of grades is even
      double num1 = grades[grades.length / 2 - 1]; //set num1 as grades.length / 2 and -1
      double num2 = grades[grades.length / 2]; //set num2 as grades.length / 2
      return (num1 + num2) / 2; //return the result of their mean
    } //end if grades are even

    else { //if the number of grades is odd
      return grades[grades.length / 2]; //return the grade that's in the middle of the list
    } //end else
  } //end getMedian()

  // Name: getMode()
  // Purpose: get the mode of the list
  // Iuput: list of the grades
  // Return: the mode of the grades
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
