import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}
