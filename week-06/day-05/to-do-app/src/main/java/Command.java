import java.util.List;

public abstract class Command {
  private String flag;
  private String usage;

  public Command(String flag, String usage) {
    this.flag = flag;
    this.usage = usage;
  }

  public void execute(List<Task> taskList) {}

  public String getFlag() {
    return flag;
  }

  public String getUsage() {
    return " -" + flag + " " + usage;
  }
}
