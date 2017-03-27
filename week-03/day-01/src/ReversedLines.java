import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static final String TXT_PATH = "assets/reversed-lines.txt";

  public static void main(String[] args) {
    List<String> lines = loadFileToList();
    String reversedLines = lineReverser(lines);
    System.out.println(reversedLines);
  }

  public static List<String> loadFileToList() {
    List<String> lines;
    try {
      Path filePath = Paths.get(TXT_PATH);
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
      lines = new ArrayList<>();
    }
    return lines;
  }

  public static String lineReverser(List<String> lines) {
    String reversedLines = "";
    for (String line : lines) {
      StringBuilder lineB = new StringBuilder(line);
      reversedLines += (lineB.reverse().toString() + "\n");
    }
    return reversedLines;
  }
}
