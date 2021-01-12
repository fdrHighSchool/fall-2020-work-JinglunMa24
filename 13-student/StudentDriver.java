import java.util.*;

public class StudentDriver {
  public static void main(String[] args) {
    Student student1 = new Student("Ma", "239970163");
    Student student2 = new Student("Hello", "1266874531");
    System.out.println(student1);
    System.out.println(student2);

    student1.setName("Jinglun");
    System.out.println(student1);

    System.out.println(student1.getName());
    System.out.println(student1.getOSIS());

    student1.addGrades(100);
    student1.displayGrades();
    student1.addGrades(90);
    student1.displayGrades();

    student2.addGrades(95);
    student2.displayGrades();

    Student student3 = new Student("Siri", "987654321");
    student3.fillArray();
    student3.displayGrades();

  } //end main

} //end class
