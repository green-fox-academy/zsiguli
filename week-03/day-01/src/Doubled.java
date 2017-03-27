import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static final String TXT_PATH = "assets/duplicated-chars.txt";

  public static void main(String[] args) {
    List<String> lines;
    //test
    try {
      Path filePath = Paths.get(TXT_PATH);
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
      lines = new ArrayList<>();
    }
    System.out.println(lines);
  }
}
