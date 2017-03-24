import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by markovich on 2017.03.24..
 */
public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    ArrayList<String> palindromes = new ArrayList<>();

    if (input.equals(stringReverser(stringToBuilder(input)).toString())){
      palindromes.add(input);
    }

    System.out.println(palindromes);
  }

  public static StringBuilder stringReverser(StringBuilder str) {
    for (int i = 0; i < str.length() / 2; i++ ) {
      char temp = str.charAt(i);
      str.setCharAt(i, str.charAt(str.length()-1-i));
      str.setCharAt(str.length() - 1 - i, temp );
    }
    return str;
  }

  public static StringBuilder stringToBuilder(String str) {
    StringBuilder strB = new StringBuilder();
    strB.append(str);
    return strB;
  }
}
