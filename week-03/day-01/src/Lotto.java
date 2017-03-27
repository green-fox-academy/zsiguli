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
    Path path = Paths.get("otos.txt");
    try {
      List<String> list = Files.readAllLines(path);
      System.out.println(list);
    } catch (IOException e) {
      System.out.println("Ooops something went wrong");
    }
  }
}
