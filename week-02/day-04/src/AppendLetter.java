import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by markovich on 2017.03.23..
 */
public class AppendLetter {
  public static void main(String[] args) {
    ArrayList<String> far = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    System.out.println(healer(far));
  }
  public static ArrayList<String> healer(ArrayList<String> far) {
    int counter = 0;
    for (String damagedAnimal: far) {
      far.set(counter++, damagedAnimal += "a");
    }
    return far;
  }
}
