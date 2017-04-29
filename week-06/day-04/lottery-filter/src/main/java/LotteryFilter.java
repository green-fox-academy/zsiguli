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
      CSVReader reader = null;
      try {
        reader = new CSVReader(new FileReader(options.has("f") ? "data/" + options.valueOf("f") : "data/otos.csv"), ';');
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      String [] nextLine;
      List<String[]> filteredData = new ArrayList<>();
      CSVWriter writer = null;
      try {
        writer = new CSVWriter(new FileWriter(options.has("o") ? "data/" + options.valueOf("o") : "data/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
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
  }
}
