import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
      List<String[]> filteredData = new ArrayList<>();
      CSVWriter writer = null;
      try {
        writer = new CSVWriter(new FileWriter("data/output.csv"), ';');
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        while ((nextLine = reader.readNext()) != null) {
          if (nextLine[0].equals(options.valueOf("y"))) {
              filteredData.add(nextLine);
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      writer.writeAll(filteredData);
      try {
        writer.close();
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
