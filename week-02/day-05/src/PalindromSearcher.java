import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by markovich on 2017.03.24..
 */
public class PalindromSearcher {
  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> palindromes = new ArrayList<>();
    String input = "";
    int speed = 70;

    if (args.length == 0) {
      System.out.println(args.length);
      printWithDelays("Hello there!", TimeUnit.MILLISECONDS, speed);
      System.out.println();
      printWithDelays("Give me some text and I will give you back the palindromes.", TimeUnit.MILLISECONDS, speed);

      System.out.println();
      input = scanner.nextLine();
    }
    else {
      input = args[0];
    }

    for (int i = 3; i <= input.length(); ++i) {
      for (int j = 0; j <= input.length() - i; ++j) {
        if ((input.substring(j, j+i)).equals((stringToBuilder((input.substring(j, j+i)))).reverse().toString())) {
          palindromes.add(("\"" + input.substring(j, j+i) + "\""));
        }
      }
    }
    for (String str: palindromes) {
      printWithDelays(str, TimeUnit.MILLISECONDS, speed);
      System.out.println();
    }
  }

  public static StringBuilder stringToBuilder(String str) {
    StringBuilder strB = new StringBuilder();
    strB.append(str);
    return strB;
  }

  public static void printWithDelays(String data, TimeUnit unit, long delay)
          throws InterruptedException {
    for (char ch:data.toCharArray()) {
      System.out.print(ch);
      unit.sleep(delay);
    }
  }
}
