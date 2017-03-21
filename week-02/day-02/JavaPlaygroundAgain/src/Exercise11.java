/**
 * Created by markovich on 2017.03.21..
 */
public class Exercise11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    double fullDay = 24 * 60 * 60;
    double leftFromTheDay = fullDay - (currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds);

    System.out.println((int) leftFromTheDay);
  }
}
