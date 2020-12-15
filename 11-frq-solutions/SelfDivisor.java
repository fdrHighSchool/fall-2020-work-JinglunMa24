import java.util.*;

public class SelfDivisor {
  public static void main(String[] args) {
  } //end main

  public static boolean isSelfDivisor(int number) {
    int n = number;
    while (n > 0) {
      int digit = n % 10;
      if (digit == 0 || number % digit % digit != 0) {
        return false;
      } //end if
      n /= 10;
    } //end while loop
    return true;
  } //end isSelfDivisor()

  public static int[] firstNumSelfDivisors(int start, int num) {
    int[] selfs = new int[num];
    int numStored = 0;
    int nextNumber = start;
    while (numStored < num) {
      if (isSelfDivisor(nextNumber)) {
        selfs[numStored] = nextNumber;
        numStored++;
      } //end if the number is self divisor
      nextNumber++;
    } //end while
    return selfs;
  } //end firstNumSelfDivisors()
} //end class
