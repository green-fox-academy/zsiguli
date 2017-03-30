public class NumberAdder {
  public static void main(String[] args) {
    int num = numberAdder(6);
  }

  public static int numberAdder(int i) {
    if (i == 1) {
      System.out.println(i);
      return 1;
    }
    else {
      System.out.println(i);
      return numberAdder(i - 1);
    }
  }
}
