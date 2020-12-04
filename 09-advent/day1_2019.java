import java.util.*;
import java.io.*;
import java.lang.Math;

public class day1_2019 {
  public static void main(String[] args) {
    part1();
  } //end main

  public static void part1() {
    int total = 0;
    double holder = 0.0;
    try{
      Scanner s = new Scanner(new File("inputs2019.txt"));
      while(s.hasNext()){
        int val = Integer.parseInt(s.next());
        holder = val/3.0 - 2;
        holder = Math.floor(holder);
        total += (int)holder;
      }//end while loop
      System.out.println(total);
      s.close();
    }//end try
    catch(Exception e){
      System.out.println("file not found");
    }//end catch
  } //end part1()

} //end class
