public class APCalendar {
  public static void main(String[] args) {
  } //end main

  public static int numberOfLeapYears(int year1, int year2) {
    int count = 0;
    for (int i = year1; i <= year2; i++) {
      if (isLeapYear(i)) {
        count++;
      } //end if the year between year 1 and year 2 is a leap year
    } //end for loop
    return count;
  } //end numberOfLeapYears()

  public static int dayOfWeek(int month, int day, int year) {
    int firtDay = firstDayOfYear(year);
    int day = dayOfYear(month, day, year);
    return (firstDay + day - 1) % 7;
  } //end dayOfWeek()

} //end class
