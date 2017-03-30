public class SumDigit {
  public static void main(String[] args) {
    int num = sumDigit(123456789);
    System.out.println(num);
  }

  public static int sumDigit(int i) {
    if (i < 10) {
      return i;
    }
    return i % 10 + sumDigit(i / 10);
  }
}
