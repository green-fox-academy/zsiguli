import java.util.Scanner;

/**
 * Created by markovich on 2017.03.22..
 */
public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    factorio(scanner.nextInt());
  }
  public static void factorio(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.println(fact);
  }
}
