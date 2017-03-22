/**
 * Created by markovich on 2017.03.22..
 */
public class Exercise35 {
  public static void main(String[] args) {
    int black = 0;
    int white = 1;
    int counter = 1;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 4; j++) {
        if (counter % 2 == 1) {
          System.out.print(black);
          System.out.print(white);
        } else {
          System.out.print(white);
          System.out.print(black);
        }
      }
      ++counter;
      System.out.println();
    }
  }
}
