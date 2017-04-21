public class ToDoApp {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();

    if (args.length == 0) {
      toDoList.printUsage();
    } else if (args[0] == "-l") {
      toDoList.run(args);
    }
  }
}