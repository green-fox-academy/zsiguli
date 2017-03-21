/**
 * Created by markovich on 2017.03.21..
 */
public class Exercise10 {
  public static void main(String[] args) {
    double a = 5.4;
    double b = 6.87;
    double c = 754;

    double surfaceArea = 2 * (a * b + b * c + c * a);
    double volume = a * b * c;

    System.out.println((int) surfaceArea);
    System.out.println((int) volume);
  }
}
