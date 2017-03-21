/**
 * Created by markovich on 2017.03.21..
 */
public class Exercise06 {
  public static void main(String[] args) {
    double semesterInWeeks = 17;
    double avarageDailyCodingHours = 6;
    double wordays = 5;
    double avarageWorkday = 52;

    double fullCodingTime = semesterInWeeks * wordays * avarageDailyCodingHours;
    double fullSemesterTimeInHours = semesterInWeeks * avarageWorkday;

    System.out.println(fullCodingTime / fullSemesterTimeInHours * 100 + " %");

  }
}
