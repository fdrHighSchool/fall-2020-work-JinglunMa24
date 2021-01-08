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

    return "";
  } //end getName()

  public String getOSIS() {

    return "";
  } //end getOSIS()

  public void setName(String name) {
    this.name = name;

  } //end setName()

  public void addGrades(int arr) {


  } //end addGrades()

  public double calculateAverage() {

    return 0.0;
  } //end calculateAverage()

  public String toString() {
    return "Student:" + this.name + " OSIS:" + this.osis;
  } //end toString()

} //end class
