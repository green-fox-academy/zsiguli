import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static final String TXT_PATH = "assets/reversed-lines.txt";

  public static void main(String[] args) {
    List<String> lines = loadFileToList();
    List<String> reversedLines = lineReverser(lines);
    try {
      Path filePath = Paths.get(TXT_PATH);
      Files.write(filePath, reversedLines);

    } catch (IOException e) {
      System.out.println("oops@");
    }

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

  public static List<String> lineReverser(List<String> lines) {
    List<String> reversedLines = new ArrayList<>();
    for (String line : lines) {
      StringBuilder lineB = new StringBuilder(line);
      reversedLines.add(lineB.reverse().toString() + "\n");
    }
    return reversedLines;
  }
}
