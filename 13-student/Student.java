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

  public String getName(String name) {
    this.name = name;
    return name;
  } //end getName()

  public String getOSIS(String osis) {
    this.osis = osis;
    return osis;
  } //end getOSIS()

  public void setName(String name) {
    this.name = name;
  } //end setName()

  public void addGrades(int grade) {
    this.grades = new int[10];
    grades.add(grade);
  } //end addGrades()

  public double calculateAverage() {

    return 0.0;
  } //end calculateAverage()

  public String toString() {
    return "Student:" + this.name + "\nOSIS:" + this.osis;
  } //end toString()

} //end class
