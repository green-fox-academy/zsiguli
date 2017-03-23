import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by markovich on 2017.03.23..
 */
public class QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String temp = list.get(2);
    list.set(2, list.get(5));
    list.set(5, temp);

    System.out.println(list);
       // Also, print the sentence to the output with spaces in between
  }
}
