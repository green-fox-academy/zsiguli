public class Power {
  public static void main(String[] args) {
    int num = powerN(1, 1);
    System.out.println(num);
  }

  public static int powerN(int base, int n) {
    if (n == 0) {
      return 1;
    }
    return base * powerN(base, n - 1);
  }
}
