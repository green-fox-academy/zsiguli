import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by markovich on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    makeTempFileWithUsefulData(parseUsefulDataFromInput("otos.txt"));
  }

  public static List<String> parseUsefulDataFromInput(String inputFile) {
    List<String> winnerNums = new ArrayList<>();
    try {
      for (String line: Files.readAllLines(Paths.get(inputFile))) {
        winnerNums.add(line.substring(line.lastIndexOf(("Ft")) + 3));
      }
    } catch (IOException e) {
      winnerNums.add("Ooops something went wrong, during the reading");
    }
    return winnerNums;
  }

  public static void makeTempFileWithUsefulData(List<String> goesToTemp) {
    Path tempPath = Paths.get("temp.txt");
    try{
        Files.write(tempPath, goesToTemp);
    } catch (IOException e) {
      System.out.println("Oops something went wrong");
    }
  }
}
