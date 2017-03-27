import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by markovich on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    System.out.println(parseUsefulDataFromInput("otos.txt"));
  }

  public static List<String> parseUsefulDataFromInput(String inputFile) {
    List<String> winnerNums = new ArrayList<>();
    try {
      for (String line: Files.readAllLines(Paths.get(inputFile))) {
        winnerNums.add(line.substring(line.lastIndexOf(("Ft")) + 3));
      }
    } catch (IOException e) {
      winnerNums.add("Ooops something went wrong");
    }
    return winnerNums;
  }
}
