import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by markovich on 2017.03.24..
 */
public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> palindromes = new ArrayList<>();

    System.out.print("Hello there! Give me some text and I will give you back the palindromes.");
    System.out.println();
    String input = scanner.nextLine();

    for (int i = 3; i <= input.length(); ++i) {
      for (int j = 0; j <= input.length() - i; ++j) {
        if ((input.substring(j, j+i)).equals((stringToBuilder((input.substring(j, j+i)))).reverse().toString())) {
          palindromes.add(("\"" + input.substring(j, j+i) + "\""));
        }
      }
    }
    System.out.println(palindromes);
  }

  public static StringBuilder stringToBuilder(String str) {
    StringBuilder strB = new StringBuilder();
    strB.append(str);
    return strB;
  }
}
