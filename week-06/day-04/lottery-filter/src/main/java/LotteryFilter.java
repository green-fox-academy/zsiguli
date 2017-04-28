import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class LotteryFilter {
  public static void main(String[] args) {
    OptionParser parser = new OptionParser("y:f:o:");

    OptionSet options = parser.parse(args);

    if (options.has("y")) {
      System.out.println(options.valueOf("y"));
    }

    if (options.has("f")) {
      System.out.println(options.valueOf("f"));
    }

    if (options.has("o")) {
      System.out.println(options.valueOf("o"));
    }
  }
}
