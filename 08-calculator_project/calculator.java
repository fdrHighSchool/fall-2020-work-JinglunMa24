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
        operand1 = convertMix(operand1);
      } //end if operand1 has / and no _
      else if (!operand1.contains("_")){
        operand1 += "_0/1";
      } //end if only integer
    String operand2 = exp.substring(secondS + 1, exp.length());
      if (operand2.contains("/") && !operand2.contains("_")) {
        operand2 = convertMix(operand2);
      } //end if operand2 has / and no _
      else if (!operand2.contains("_")){
        operand2 += "_0/1";
      } //end if only integer
    if (operator.equals("+")) {
      operand1 = convertFraction(operand1);
      operand2 = convertFraction(operand2);
      String result = calculationAdd(operand1, operand2);
      return result;
    } //end addition

    else if (operator.equals("-")) {
      operand1 = convertFraction(operand1);
      operand2 = convertFraction(operand2);
      String result = calculationMinus(operand1, operand2);
      return result;
    } //end subtraction

    else if (operator.equals("*")) {
      operand1 = convertFraction(operand1);
      operand2 = convertFraction(operand2);
      String result = calculationDivide(operand1, operand2);
      return result;
    } //end multiplication

    else if (operator.equals("/")) {
      operand1 = convertFraction(operand1);
      operand2 = convertFraction(operand2);
      String result = calculationMultiply(operand1, operand2);
    } //end division

    return "Error";

  } //end produceAnswer()

  public static String calculationAdd(String firstF, String secondF) {
    String numer1 = getNumer1(firstF);
    String denom1 = getDenom1(firstF);
    String numer2 = getNumer2(secondF);
    String denom2 = getDenom2(secondF);
    int Fnumer = Integer.parseInt(numer1) * Integer.parseInt(denom2) + Integer.parseInt(numer2) * Integer.parseInt(denom1);
    int Fdenom = Integer.parseInt(denom1) * Integer.parseInt(denom2);
    String result = reduceFraction(Fnumer, Fdenom);
    String Fresult = convertMix(result);
    return Fresult;
  } //end addition()

  public static String calculationMinus(String firstF, String secondF) {
    String numer1 = getNumer1(firstF);
    String denom1 = getDenom1(firstF);
    String numer2 = getNumer2(secondF);
    String denom2 = getDenom2(secondF);
    int Fnumer = Integer.parseInt(numer1) * Integer.parseInt(denom2) - Integer.parseInt(numer2) * Integer.parseInt(denom1);
    int Fdenom = Integer.parseInt(denom1) * Integer.parseInt(denom2);
    String result = reduceFraction(Fnumer, Fdenom);
    String Fresult = convertMix(result);
    return Fresult;
  } //end subtraction()

  public static String calculationMultiply(String firstF, String secondF) {
    String numer1 = getNumer1(firstF);
    String denom1 = getDenom1(firstF);
    String numer2 = getNumer2(secondF);
    String denom2 = getDenom2(secondF);
    int Fnumer = Integer.parseInt(numer1) * Integer.parseInt(numer2);
    int Fdenom = Integer.parseInt(denom1) * Integer.parseInt(denom2);
    String result = reduceFraction(Fnumer, Fdenom);
    String Fresult = convertMix(result);
    return Fresult;
  } //end multiplication()

  public static String calculationDivide(String firstF, String secondF) {
    String numer1 = getNumer1(firstF);
    String denom1 = getDenom1(firstF);
    String numer2 = getNumer2(secondF);
    String denom2 = getDenom2(secondF);
    int Fnumer = Integer.parseInt(numer1) * Integer.parseInt(denom2);
    int Fdenom = Integer.parseInt(denom1) * Integer.parseInt(numer2);
    String result = reduceFraction(Fnumer, Fdenom);
    String Fresult = convertMix(result);
    return Fresult;
  } //end division

  public static String convertMix(String fraction) {
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

  public static String convertFraction(String fraction) {
    int lowDash = fraction.indexOf("_");
    int divide = fraction.indexOf("/");
    String whole = fraction.substring(0, lowDash);
    String numer = fraction.substring(lowDash + 1, divide);
    String denom = fraction.substring(divide + 1, fraction.length());
    int Fnumer = Integer.parseInt(whole) * Integer.parseInt(denom) + Integer.parseInt(numer);
    String result = String.valueOf(Fnumer) + "/" + denom;
    return result;
  } //end convertFraction();

  public static String getNumer1(String fraction1) {
    int divide = fraction1.indexOf("/");
    String numer1 = fraction1.substring(0, divide);
    return numer1;
  } //end get numer1
  public static String getDenom1(String fraction1) {
    int divide = fraction1.indexOf("/");
    String denom1 = fraction1.substring(divide + 1, fraction1.length());
    return denom1;
  } //end get denom1
  public static String getNumer2(String fraction2) {
    int divide = fraction2.indexOf("/");
    String numer2 = fraction2.substring(0, divide);
    return numer2;
  } //end get numer2
  public static String getDenom2(String fraction2) {
    int divide = fraction2.indexOf("/");
    String denom2 = fraction2.substring(divide + 1, fraction2.length());
    return denom2;
  } //end get denom2

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
