public class Counter {
  public static void main(String[] args) {
    int num = counter(3);
    System.out.println(num);
  }
  public static int counter(int i) {
    if (i == 1) {
      return 1;
    }
    else {
      return i + counter(i - 1);
    }
  }
}
