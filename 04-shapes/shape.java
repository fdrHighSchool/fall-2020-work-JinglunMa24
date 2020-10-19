public class shape {
  public static void main (String[] args) {
    square(4.5);
    square(10);
  } //close main

  public static void square(int len){
    for (int row = 0; row < len; row++) {
      for (int col = 0; col < len; col++) {
        System.out.print("* ");
      } //close for col
    System.out.println();
  } //close for row
    double area = Math.pow(len,2);
    System.out.println("The area of square is: " + area);
  } //close square

}//close shape
