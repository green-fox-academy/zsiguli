import java.util.List;

public class ListCommand extends Command {
  public ListCommand() {
    super("l", "Lists all the tasks");
  }

  @Override
  public void execute(List<Task> tasksList) {
    String tasks = new String();
    for (Task task : tasksList) {
      if (task.isDone()) {
        tasks += "[x] ";
      } else {
        tasks += "[ ] ";
      }
      tasks += task.getDescription();
    }
    System.out.println(tasks);
  }
}