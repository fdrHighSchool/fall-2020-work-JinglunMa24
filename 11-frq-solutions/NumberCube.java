public class NumberCube {
  public static void main(String[] args) {
  } //end main

  public static int[] getCubeTosses(NumberCube cube, int numTosses) {
    int[] array = new int[numTosses];
    for (int i = 0; i < array.length; i++) {
      array[i] = cube.toss();
    } //end for loop
    return array;
  } //end getCubeTosses()

  public static int getLongestRun(int[] values) {
    int maxRunIndex = -1;
    int maxRunLength = 1;
    int runIndex = 0, runLength = 1;
    for (int i = 0; i < values.length; i++) {
      if (values[i] == values[runIndex]) {
        runLength++;
        if (runLength > maxRunLength) {
          maxRunLength = runLength;
          maxRunIndex = runIndex;
        } //end if the running length is greater than the max running length
      } //end values is equals to
      else {
        runIndex = i;
        runLength = 1;
      } //end else
    } //end for loop
    return maxRunIndex;
  } //end getLongestRun()
} //end class
