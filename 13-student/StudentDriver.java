import java.util.*;

public class StudentDriver {
  public static void main(String[] args) {
    String name = "", osis = "";
    Student student1 = new Student(name, osis);

    student1.setName("Jinglun");
    name = student1.getName("Jinglun");
    osis = student1.getOSIS("239970163");
    System.out.println(student1);

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter the grade: ");
      int grade = input.nextInt();
      student1.addGrades(grade);
    } //end for loop
    //System.out.println(Arrays.toString(grades));
  } //end main

} //end class
