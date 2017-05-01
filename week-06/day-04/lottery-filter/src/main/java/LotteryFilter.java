import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import joptsimple.OptionSet;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LotteryFilter {
  OptionSet options;
  CSVReader reader;
  CSVWriter writer;
  String[] nextLine;
  List<String[]> filteredData;

  public LotteryFilter(OptionSet options) throws IOException {
    this.options = options;
    this.reader = new CSVReader(new FileReader(options.has("f") ? "data/" + options.valueOf("f") : "data/otos.csv"), ';');
    this.writer = new CSVWriter(new FileWriter(options.has("o") ? "data/" + options.valueOf("o") : "data/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
    this.filteredData = new ArrayList<>();
  }

  public void run() throws IOException {
    if (options.has("y")) {
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

