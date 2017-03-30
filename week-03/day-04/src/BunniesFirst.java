public class BunniesFirst {
  public static void main(String[] args) {
    int num = bunnieEars(50);
    System.out.println(num);
  }

  public static int bunnieEars(int population) {
    if (population == 1) {
      return 2;
    }
    else {
      return 2 + bunnieEars(population - 1);
    }
  }
}
