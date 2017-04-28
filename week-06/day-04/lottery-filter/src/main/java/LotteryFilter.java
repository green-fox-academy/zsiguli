import au.com.bytecode.opencsv.CSVReader;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LotteryFilter {
  public static void main(String[] args) {
    OptionParser parser = new OptionParser("y:f:o:");

    OptionSet options = parser.parse(args);

    if (options.has("y")) {
      System.out.println(options.valueOf("y"));
      CSVReader reader = null;
      try {
        reader = new CSVReader(new FileReader("data/otos.csv"), ';');
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      String [] nextLine;
      try {
        while ((nextLine = reader.readNext()) != null) {
          if (nextLine[0].equals(options.valueOf("y")))
          System.out.println(nextLine[0] + nextLine[1]);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    if (options.has("f")) {
      System.out.println(options.valueOf("f"));
    }

    if (options.has("o")) {
      System.out.println(options.valueOf("o"));
    }
  }
}
