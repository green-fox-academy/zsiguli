/**
 * Created by markovich on 2017.03.21..
 */
public class Exercise12 {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;
    int c;

    c = a;
    a = b;
    b = c;

    System.out.println(a);
    System.out.println(b);
  }
}
