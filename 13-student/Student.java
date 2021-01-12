import java.util.*;

public class Student {
  // instance variables
  private String name;
  private String osis;
  private int[] grades;

  // constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    grades = new int[10];
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
  }// end fillArray method

  public void addGrades(int grade) {
    int i = 0;

    while (this.grades[i] != 0) {
      i++;
    } //end while loop

    this.grades[i] = grade;
  } //end addGrades()

  public double calculateAverage() {
    double sum = 0.0;
    int count = 0;

    for (int i = 0; i < this.grades.length; i++) {
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      } //end if value if not 0
    } //end for loop
    return sum / count;
  } //end calculateAverage()

  public String toString() {
    return "Student:" + this.name + " OSIS:" + this.osis;
  } //end toString()

} //end class
