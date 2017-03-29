import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static final String TEXT_PATH = "assets/reversed-order.txt";

  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();
    Path path = Paths.get(TEXT_PATH);
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("oops something went wrong");
    }
    System.out.println(lines);
  }
}