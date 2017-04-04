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

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " +
            students.size() + " students and " +
            mentors.size() + " mentors.");
  }
}
