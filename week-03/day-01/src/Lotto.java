import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * Created by markovich on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    try {
      for (String line: Files.readAllLines(Paths.get("otos.txt"))) {
      ArrayList<String> winnerNums = new ArrayList<>();
      winnerNums.add(line.substring(line.lastIndexOf(("Ft")) + 3));
      }
    } catch (IOException e) {
      System.out.println("Ooops something went wrong");
    }
  }
}
