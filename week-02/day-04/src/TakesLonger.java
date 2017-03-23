/**
 * Created by markovich on 2017.03.23..
 */
public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    System.out.println(quote.substring(0, quote.indexOf("I") + 3)
            + "always takes longer than"
            + quote.substring(quote.indexOf("y") - 1));
  }
}
