import java.util.Scanner;

/**
 * Created by markovich on 2017.03.22..
 */
public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int ceil = scanner.nextInt();
    sum(ceil);
  }
  public static void sum (int arg) {
    int summary = 0;
    for (int i = 0; i < arg; i++) {
      summary += i;
    }
    System.out.println(summary);
  }
}
