import java.util.*;

public class calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the fractions expression: ");
    String exp = input.nextLine();
    produceAnswer(exp);

  } //end main

  public static String convertFraction(String fraction) {
    int lowDash = fraction.indexOf("_");
    int divide = fraction.indexOf("/");
    String num1 = fraction.substring(0, lowDash);
    String num2 = fraction.substring(lowDash + 1, divide);
    String num3 = fraction.substring(divide + 1, fraction.length());
    int cal = Integer.parseInt(num1) * Integer.parseInt(num3) + Integer.parseInt(num2);
    String num = reduceFraction(cal, Integer.parseInt(num3));
    return num;
  } //end determineFraction()

  public static String produceAnswer(String exp) {
    if (exp.contains("+")) {
      int add = exp.indexOf("+");
      String num1 = exp.substring(0, add);
        if (num1.contains("_")) {
          num1 = convertFraction(num1);
        } //end if num1 has "_"
      String num2 = exp.substring(add + 1, exp.length());
        if (num2.contains("_")) {
          num2 = convertFraction(num2);
        } //end if num2 has "_"
      else if (num1.contains("_") && num2.contains("_")) {
        num1 = convertFraction(num1);
        num2 = convertFraction(num2);
      }
      else if (!num1.contains("/") && !num1.contains("_")) {
        num1 = num1 + "/1";
      } //end if num1 doesn't have "/" and "_"
      else if (!num2.contains("/") && !num2.contains("_")) {
        num2 = num1 + "/1";
      } //end if num2 doesn't have "/" and "_"
      System.out.peintln(calculationAdd(num1, num2));
    } //end +

  } //end produceAnswer()

  public static String calculationAdd(String firstF, String secondF) {
    int divide1 = firstF.indexOf("/");
    int divide2 = secondF.indexOf("/");
    String num1 = firstF.substring(0, divide1);
    String num2 = firstF.substring(divide1 + 1, firstF.length());
    String num3 = secondF.substring(0, divide2);
    String num4 = secondF.substring(divide2 + 1, secondF.length());
    int cal1 = Integer.parseInt(num1) * Integer.parseInt(num4) + Integer.parseInt(num2) * Integer.parseInt(num3);
    int cal2 = Integer.parseInt(num2) * Integer.parseInt(num4);
    String num = reduceFraction(cal1, cal2);
    return num;
  } //end calculation()

  public static String reduceFraction(int x, int y) {
    int d;
    d = __gcd(x, y);
    x = x / d;
    y = y / d;
    String num = String.valueOf(x) + "/" + String.valueOf(y);
    return num;
  } //end reduceFraction()

  public static int __gcd(int a, int b) {
    if (b == 0) {
      return a;
    } //end if
    return __gcd(b, a % b);
  } //end __gcd()

} //end class
