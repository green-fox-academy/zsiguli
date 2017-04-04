public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi I'm " + getName() + ", a " + getAge() + " old " + getGender() +
            " from " + previousOrganization + " who skipped " + skippedDays +
            " days from the course already.");
  }

  public void skipDays() {
    skippedDays++;
  }
}
