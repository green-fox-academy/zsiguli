public class Task {
  private boolean done;
  private String description;

  public Task(String description) {
    this.done = false;
    this.description = description;
  }

  public Task(String description, boolean isDone) {
    this.done = isDone;
    this.description = description;
  }

  public boolean isDone() {
    return done;
  }

  public String getDescription() {
    return description;
  }
}
