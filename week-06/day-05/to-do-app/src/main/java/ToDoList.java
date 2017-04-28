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
    List<String> rawData = FileIO.getTasksFromFile();
    for (String task : rawData) {
      String[] taskParts = task.split(";");
      if (taskParts[1].equals("0")) {
        tasks.add(new Task(taskParts[0]));
      } else {
        tasks.add(new Task(taskParts[0], true));
      }
    }
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

  public void run(String[] args) {
    if (args.length == 0) {
      printUsage();
    } else {
      for (Command command : commands) {
        if (('-' + command.getFlag()).equals(args[0])) {
          try {
            command.execute(tasks, args[1]);
          } catch (Exception ex) {
            ErrorHandler errorHandler = new ErrorHandler(args, ex);
            System.out.println(errorHandler);
          }
        }
      }
      FileIO.writeTasksToFile(tasks);
    }
  }
}
