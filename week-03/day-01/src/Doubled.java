import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static final String TXT_PATH = "assets/duplicated-chars.txt";

  public static void main(String[] args) {
    List<String> lines = loadFileToList();
    String decodedText = duplicationRemover(lines);
    System.out.println(decodedText.replaceAll("\\.", ". "));
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

  public static String duplicationRemover(List<String> lines) {
    String decodedText = "";
    for (String line : lines) {
      for (int i = 0; i < line.length(); i += 2) {
        decodedText += line.charAt(i);
      }
    }
    return decodedText;
  }
}
