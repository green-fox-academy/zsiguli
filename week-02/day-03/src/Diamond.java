/**
 * Created by markovich on 2017.03.22..
 */
public class Diamond {
  public static void main(String[] args) {
    String one = "+";
    String another = "-";
    int target1 = 2;
    int target2 = 4;
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        if (j > target1 && j < target2) {
          System.out.print(one);
        } else {
          System.out.print(another);
        }
      }
      System.out.println();
    }
  }
}