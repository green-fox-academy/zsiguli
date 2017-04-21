import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
  private static final Path STORE_PATH = Paths.get("data/store.csv");

  public static List<String> getListFromFile() {
    List<String> listFromFile;
    try {
      listFromFile = Files.readAllLines(STORE_PATH);
    } catch (IOException e) {
      listFromFile = new ArrayList<>();
      System.out.println("Something wrong happened, during the file read. Check assets/store.csv");
    }
    return listFromFile;
  }

  public static void writeListToFile(List<String> listToWrite) {
    try {
      Files.write(STORE_PATH, listToWrite);
    } catch (IOException e) {
      System.out.println("Something wrong happened, during the file write. Check assets/store.csv");
    }
  }
}
