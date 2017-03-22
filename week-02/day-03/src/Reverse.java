import java.util.Arrays;

/**
 * Created by markovich on 2017.03.22..
 */
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    for (int i = 0; i < aj.length / 2; i++) {
      int temp = aj[aj.length - 1 - i];
      aj[aj.length - 1 - i] = aj[i];
      aj[i] = temp;
    }
    System.out.println(Arrays.toString(aj));
  }
}
