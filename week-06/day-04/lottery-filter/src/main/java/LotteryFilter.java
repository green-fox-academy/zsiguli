import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class LotteryFilter {
  public static void main(String[] args) {
    OptionParser parser = new OptionParser("y:f:o:");
    OptionSet options = parser.parse(args);
  }
}
