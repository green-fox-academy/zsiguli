/**
 * Created by markovich on 2017.03.22..
 */
public class Diamond {
  public static void main(String[] args) {
    String one = "+";
    String another = "-";

    for (int i = 0; i < 7; i++) {
      if (i == 3) {
        System.out.print(one);
      } else {
        System.out.print(another);
      }
    }
  }
}