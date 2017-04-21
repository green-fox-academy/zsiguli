import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  private List<Command> commands;

  public ToDoList() {
    commands = new ArrayList<>();
    commands.add(new ListCommand());
    commands.add(new AddCommand());
    commands.add(new RemoveCommand());
    commands.add(new CompleteCommand());
  }

  public void printUsage() {
    String usage = "Java Todo application\n" +
            "=====================\n" +
            "Command line arguments:\n";
    for (Command command : commands) {
      usage += command.getUsage() + "\n";
    }
    System.out.println(usage);
  }
}
