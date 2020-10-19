import java.util.*;

public class Temperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hi, this is a system that allow you to transfer temperature degree Celsius to Fahrenheit or Fahrenheit to Celsius.");
    System.out.println("Chose what to transfer.\n1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
    int chose = input.nextInt();

    if (chose == 1) {
      System.out.print("Enter the value of degree Celsius: ");
      double cel = input.nextDouble();
      double fah = (cel * ((double)9/5)) + 32;
      System.out.println("Value of degree Celsius " + cel + " is equals to Fahrenheit " + fah);
    } //end chose 1

    else if (chose == 2) {
      System.out.print("Enter the value of degree Fahrenheit: ");
      double fah = input.nextDouble();
      double cel = (fah - 32) * ((double)5/9);
      System.out.println("Value of degree Fahrenheit " + fah + " is equals to Celsius " + cel);
    } //end chose 2

    else {
      System.out.println("ERROR. CAN NOT DEFINE");
    } //end else

  } //end main
} //end class
