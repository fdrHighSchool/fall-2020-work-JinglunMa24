import java.util.*;

public class calculator {
  public static void main(String[] args) {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the fractions expression(Type quit to stop): ");
      String exp = input.nextLine();
      if (!exp.equals("quit")) {
        System.out.println(produceAnswer(exp));
      } //end produceAnswer
      else {
        break;
      } //end break
    } //end while loop

  } //end main

  public static String produceAnswer(String exp) {
    int firstS = exp.indexOf(" ");
    int secondS = exp.lastIndexOf(" ");
    String operator = exp.substring(firstS + 1, secondS);
    String operand1 = exp.substring(0, firstS);
      if (operand1.contains("/") && !operand1.contains("_")) {
        operand1 = convertFraction(operand1);
      } //end if operand1 has / and no _
      else if (!operand1.contains("_")){
        operand1 += "_0/1";
      } //end if only integer
    String operand2 = exp.substring(secondS + 1, exp.length());
      if (operand2.contains("/") && !operand2.contains("_")) {
        operand2 = convertFraction(operand2);
      } //end if operand2 has / and no _
      else if (!operand2.contains("_")){
        operand2 += "_0/1";
      } //end if only integer
    return operand2;

  } //end produceAnswer()

  public static String convertFraction(String fraction) {
    int divide = fraction.indexOf("/");
    String numer = fraction.substring(0, divide);
    String denom = fraction.substring(divide + 1, fraction.length());
    String reducedF = reduceFraction(Integer.parseInt(numer), Integer.parseInt(denom));
    int rDivide = reducedF.indexOf("/");
    String rNumer = reducedF.substring(0, rDivide);
    String rDenom = reducedF.substring(rDivide + 1, reducedF.length());
    int integer = Integer.parseInt(rNumer) / Integer.parseInt(rDenom);
    int Fnumer = Integer.parseInt(rNumer) % Integer.parseInt(rDenom);
    String result = String.valueOf(integer) + "_" + String.valueOf(Fnumer) + "/" + rDenom;
    return result;
  } //end determineFraction()

  public static void calculationAdd(String firstF, String secondF) {

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
