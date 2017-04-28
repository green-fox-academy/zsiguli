public class ErrorHandler {
  String[] args;
  Exception ex;

  public ErrorHandler(String[] args, Exception ex) {
    this.args = args;
    this.ex = ex;
  }

  @Override
  public String toString() {
    String str;
    str = "Error type: " + ex.toString() + "\n";
    str += "Argument(s): ";
    for (String arg : args) {
      str += arg + " ";
    }
    return str;
  }
}
