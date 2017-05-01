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
  public static void main(String[] args) throws IOException {
    OptionParser parser = new OptionParser("y:f:o:");
    OptionSet options = parser.parse(args);

    CSVReader reader;
    CSVWriter writer;
    String[] nextLine;
    List<String[]> filteredData = new ArrayList<>();

    if (options.has("y")) {
      reader = new CSVReader(new FileReader(options.has("f") ? "data/" + options.valueOf("f") : "data/otos.csv"), ';');
      writer = new CSVWriter(new FileWriter(options.has("o") ? "data/" + options.valueOf("o") : "data/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
      while ((nextLine = reader.readNext()) != null) {
        if (nextLine[0].equals(options.valueOf("y"))) {
          filteredData.add(nextLine);
        }
      }
      writer.writeAll(filteredData);
      writer.close();
    }
  }
}
