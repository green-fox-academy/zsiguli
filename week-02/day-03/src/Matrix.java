/**
 * Created by markovich on 2017.03.22..
 */
public class Matrix {
  public static void main(String[] args) {
    int chosenOne = 0;

    for (int i = 0; i < 4; i++) {
      if (i == chosenOne) {
        System.out.print(1 + " ");
      } else {
        System.out.print(0 + " ");
      }
    }
  }
}
