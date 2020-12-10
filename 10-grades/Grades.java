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
    System.out.println(getMode(grades)); //print out the mode
  } //end main

  // Name: getAverage()
  // Purpose: get mean of the list
  // Input: list of the grades
  // Return: the average of the grades
  public static double getAverage(int[] grades) {
    double sum = 0; //set a sum

    for (int i : grades) { //for each loop to add up all the terms in the list
      sum += i; //add them up into sum
    } //end loop

    return sum / grades.length; //return the result
  } //end getAverage()

  // Name: getMedian()
  // Purpose: get the median of the list
  // Iuput: list of the grades
  // Return: the median of the grades
  public static double getMedian(int[] grades) {
    //sort the grades list from smallest to greatest
    for (int i = 0; i < grades.length; i++) { //for i loop
      for (int j = i + 1; j < grades.length; j++) { //for j loop
        int temp = 0; //set a int temp
        if (grades[i] > grades[j]) { //see if the next term is greater than the pervious one
          temp = grades[i]; //set temp = grades[i]
          grades[i] = grades[j]; //replace grades[i] with grades[j]
          grades[j] = temp; //replace grades[j] with temp
        } //end if next term is greater than the pervious one
      } //end for j loop
    } //end for i loop

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
  public static String getMode(int[] grades) {
    int num = 0; //set a number
    int count = 0; //set a final count
    int tempCount = 0; //set the tempCount for later use

    for (int i = 0; i < grades.length; i++) { //for i loop
      int tempNum = grades[i]; //set temporary number
      tempCount = 0; //set temporary count
      for (int j = 0; j < grades.length; j++) { //for j loop
        if (grades[i] == grades[j]) { //see if any number from j is equals to number from i
          tempCount++; //temporary count + 1
        } //end if grades index of "i" is the same as grades index of "j"
      } //end for loop for j
      if (tempCount > count) { //if temporary count is greater than count
        num = tempNum; //set the temporary number as the final numer
        count = tempCount; //set the temporary count as the final count
      } //end if count is > repeats
    } //end for loop for i

    if (tempCount == count && count != 1) { //if more than 1 repeats but same counts
      return "There are more than 1 repeats and they are equal number of times."; //set Count as true
    } //end if more than 1 repeats but same counts

    else if (count != 1) { //if yes repeats
      return "The mode of the grades is: " + num; //return the mode
    } //if no repeats

    else { //if no repeats
      return "No mode here, all grades are unique."; //return "no mode"
    } //end else
  } //end getMode()

} //end class
