import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  private List<Command> commands;
  private List<Task> tasks;

  public ToDoList() {
    commands = new ArrayList<>();
    commands.add(new ListCommand());
    commands.add(new AddCommand());
    commands.add(new RemoveCommand());
    commands.add(new CompleteCommand());

    tasks = new ArrayList<>();
    tasks.add(new Task("do something"));
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

  public List<Task> getTasks() {
    return tasks;
  }

  public List<Command> getCommands() {
    return commands;
  }

  public void run(String[] args) {
    for (Command command : commands) {
      System.out.println("flag: " + command.getFlag());
      if (('-' + command.getFlag()).equals(args[0])) {
        System.out.println("hey");
        command.execute(tasks);
      }
    }
  }
}
