public class BunniesAgain {
  public static void main(String[] args) {
    int num = notStandardBunnieEars(5);
    System.out.println(num);
  }

  public static int notStandardBunnieEars(int population) {
    if (population == 1) {
      return 2;
    }
    else if (population % 2 == 0) {
      return 3 + notStandardBunnieEars(population - 1);
    }
    else {
      return 2 + notStandardBunnieEars(population - 1);
    }
  }
}
