public class Main {
  public static void main(String[] args) {
    int hour = 13;
    int minute = 25;
    int second = 7;
    int elapsedSeconds = secondsSinceMidnight(hour, minute, second);
    int dailyseconds = secondsSinceMidnight(24, 0, 0);
    int remainingseconds = dailyseconds - elapsedSeconds;
    System.out.println("Remaining seconds in the day: " + remainingseconds);
    double percentage = 1.0 * elapsedSeconds / dailyseconds * 100;
    System.out.println("Percent of the day gone by: " + percentage);

    System.out.println("Adding tests:");
      addTime(1, 10, 30, 1, 25, 15);
      addTime(1, 10, 30, 1, 55, 50);
      addTime(1, 10, 30, 0, 113, 20);

    System.out.println("\nBetween tests:");
      timeBetween(2, 35, 45, 1, 25, 15);
      timeBetween(3, 6, 20, 1, 55, 50);
      timeBetween(3, 3, 50, 0, 113, 20);

    } //end main

  public static int secondsSinceMidnight(int h, int m, int s){
    int totalSecond = 0;
    totalSecond += s;
    totalSecond += m * 60;
    totalSecond += h * 60 * 60;
    return totalSecond;
  } //end secondsSinceMidnight


  public static void addTime(int h1, int m1, int s1, int h2, int m2, int s2) {
    int seconds1 = secondsSinceMidnight(h1, m1, s1);
    int seconds2 = secondsSinceMidnight(h2, m2, s2);
    int totalSeconds = seconds1 + seconds2;
    int finalHours = totalSeconds / 3600;
    totalSeconds %= 3600;
    int finalMins = totalSeconds / 60;
    int finalSeconds = totalSeconds % 60;
    System.out.printf("%02d:%02d:%02d\n", finalHours, finalMins, finalSeconds);
  } //end addTime


  public static void timeBetween(int h1, int m1, int s1, int h2, int m2, int s2) {
    int seconds1 = secondsSinceMidnight(h1, m1, s1);
    int seconds2 = secondsSinceMidnight(h2, m2, s2);
    int secondsBetween = seconds1 - seconds2;
    int finalHours = secondsBetween / 3600;
    secondsBetween %= 3600;
    int finalMins = secondsBetween / 60;
    int finalSeconds = secondsBetween % 60;
    System.out.printf("%02d:%02d:%02d\n", finalHours, finalMins, finalSeconds);
  } //end timeBetween

} //end class
