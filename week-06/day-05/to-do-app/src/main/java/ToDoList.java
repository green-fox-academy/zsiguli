import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
  private static final Path STORE_PATH = Paths.get("data/store.csv");

  private List<String> thingsToDo;

  public ToDoList() {
    thingsToDo = new ArrayList<>();
  }

  public ToDoList(String thingToDo) {
    thingsToDo = new ArrayList<>();
    thingsToDo.add("[ ] " + thingToDo);
  }

  public ToDoList(List<String> thingsToDo) {
    this.thingsToDo = thingsToDo;
  }

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

  public List<String> getList() {
    return thingsToDo;
  }

  public void addTask(String newTask) {
    thingsToDo.add("[ ] " + newTask);
  }

  public void checkTask(int numberOfTask) {
    int position = numberOfTask - 1;
    String checkedTask = thingsToDo.get(numberOfTask - 1).replace("[ ]", "[x]");
    thingsToDo.set(position, checkedTask);
  }

  public void removeTask(int numberOfTask) {
    thingsToDo.remove(numberOfTask - 1);
  }

  public void printTasks() {
    String thingsToDo = new String();
    for (int i = 0; i < this.thingsToDo.size(); ++i) {
      thingsToDo += (i+1) + " - " + this.thingsToDo.get(i) + "\n";
    }
    System.out.println(thingsToDo);
  }
}
