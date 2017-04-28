import java.util.List;

public class ListCommand extends Command {
  public ListCommand() {
    super("l", "Lists all the tasks");
  }

  @Override
  public void execute(List<Task> tasksList, String arg) {
    String tasks = new String();
    for (int i = 0; i < tasksList.size(); ++i) {
      tasks += i + 1 + " - ";
      if (tasksList.get(i).isDone()) {
        tasks += "[x] ";
      } else {
        tasks += "[ ] ";
      }
      tasks += tasksList.get(i).getDescription() + "\n";
    }
    System.out.println(tasks);
  }
}
