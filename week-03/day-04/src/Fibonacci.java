public class Fibonacci {
  public static void main(String[] args) {
    int num = fibonacciGenerator(6);
    System.out.println(num);
  }

  public static int fibonacciGenerator(int num) {
    if (num == 1) {
      return 0;
    }
    else if (num == 2) {
      return 1;
    }
    else {
      return fibonacciGenerator(num - 2) + fibonacciGenerator(num - 1);
    }
  }
}
