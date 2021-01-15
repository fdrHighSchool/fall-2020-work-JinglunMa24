import java.util.*;

public class Student {
  // instance variables
  private String name;
  private String osis;
  private int[] grades;
  private int numGrades;

  // constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    this.grades = new int[10];
    this.numGrades = 0;
  } //end Student()

  // other methods

  public String getName() {
    return this.name;
  } //end getName()

  public String getOSIS() {
    return this.osis;
  } //end getOSIS()

  public void displayGrades() {
    System.out.println(Arrays.toString(this.grades));
  } //end getGrades()

  public void setName(String name) {
    this.name = name;
  } //end setName()

  public void fillArray() {
    for (int i = 0; i < this.grades.length; i++) {
      this.grades[i] = (int)(Math.random() * 46 + 55);
    }// end for loop
    this.numGrades = 10;
  }// end fillArray method

  public void addGrades(int grade) {
    // if there's no room, then replace the lowest score
    if (this.numGrades == 10) {
      // search for lowest value
      int lowestIndex = 0;
      int lowestGrade = this.grades[0];

      for (int i = 0; i < this.grades.length; i++) {
        if (this.grades[i] < lowestGrade) {
          lowestIndex = i;
          lowestGrade = this.grades[i];
        } //end if
      } //end for loop

      // replace (if grade is greater than the lowest)
      this.grades[lowestIndex] = grade;
    } //end if

    else {
      this.grades[this.numGrades] = grade;
      this.numGrades++;
    } //end else

  } //end addGrades()

  public double calculateAverage() {
    double sum = 0.0;
    int count = 0;

    //VERSION 1 - loop through entire array always
    /*
    for (int i = 0; i < this.grades.length; i++) {
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      } //end if value if not 0
    } //end for loop
    */

    //VERSION 2 - use numGrades to determine how many iterations through the
    for (int i = 0; i < this.numGrades; i++) {
      sum += this.grades[i];
    } //end for loop

    return sum / this.numGrades;
  } //end calculateAverage()

  public String toString() {
    return "Student:" + this.name + " OSIS:" + this.osis;
  } //end toString()

} //end class
