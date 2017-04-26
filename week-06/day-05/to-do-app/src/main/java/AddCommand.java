import java.util.List;

public class AddCommand extends Command {
  public AddCommand() {
    super("a", "Adds a new task");
  }

  @Override
  public void execute(List<Task> taskList, String arg) {
    taskList.add(new Task(arg));
    System.out.println(taskList.size());
    System.out.println(taskList.get(1).getDescription());
  }
}
