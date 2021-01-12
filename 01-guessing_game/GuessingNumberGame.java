import java.util.*;

public class GuessingNumberGame {
  public static void main(String[] args) {
    int num = game();
    System.out.println("Welcom to the guessing random number game.");
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("Choose a number between 1 to 10.");
      int chose = input.nextInt();

      if (chose > num) {
        System.out.println("Too high, goes lower");
      } //end >

      else if (chose < num) {
        System.out.println("Too low, goes higher");
      } //end <

      else if (chose == num) {
        System.out.println("Your answer: " + chose);
        System.out.println("Correct answer: " + num);
        System.out.println("Congratulation! You won!");
        break;
      } //end =

    } //end while loop

  } //end main

  public static int game() {
    Random rand = new Random();
    int range = rand.nextInt(10);
    range = range + 1;
    return range;
  } //end game statement

} //end class
