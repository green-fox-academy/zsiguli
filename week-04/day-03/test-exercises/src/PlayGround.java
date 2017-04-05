import java.lang.reflect.Array;
import java.util.*;

public class PlayGround {
  public static Map<String, Integer> letterCounter(String word) {
    Map<String, Integer> letters = new HashMap<>();
    for (int i = 0; i < word.length(); ++i) {
      if (letters.containsKey(word.substring(i, i + 1))) {
        int temp = letters.get(word.substring(i, i + 1));
        letters.put(word.substring(i, i + 1), ++temp);
      } else {
        letters.put(word.substring(i, i + 1), 1);
      }

    }
    return letters;
  }

  public String getApple() {
    return "apple";
  }

  public long sum(List<Integer> numbers) {
    long result = 0;
    for (Integer num : numbers) {
      result += (long) num;
    }
    return result;
  }
}
