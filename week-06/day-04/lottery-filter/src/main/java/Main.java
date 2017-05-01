import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    OptionParser parser = new OptionParser("y:f:o:");
    OptionSet options = parser.parse(args);
    LotteryFilter filter = new LotteryFilter(options);
    filter.run();
  }
}
