import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by markovich on 2017.03.23..
 */
public class ElementFinder {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    if (isThereASeven(arrayList)) {
      System.out.println("Hoorray");
    }
    else {
      System.out.println("Nooooo");
    }
}
  public static Boolean isThereASeven(ArrayList<Integer> arrayList) {
    for (Integer num: arrayList) {
      if (num == 7) {
        return true;
      }
    }
    return false;
  }
}
