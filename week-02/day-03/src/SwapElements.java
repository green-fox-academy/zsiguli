import java.util.Arrays;

/**
 * Created by markovich on 2017.03.22..
 */
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    for(int i = 0; i < abc.length / 2; i++) {
      String temp = abc[i];
      abc[i] = abc[abc.length - i - 1];
      abc[abc.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(abc));
  }
}
