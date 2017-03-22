import java.util.Scanner;

/**
 * Created by markovich on 2017.03.22..
 */
public class PrintArgument {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strings = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
    printer(strings);
  }
  public static void printer (String... strArr) {
    for (int i = 0; i < strArr.length; i++) {
      System.out.println((i + 1) + ". " + strArr[i]);
    }
  }
}
