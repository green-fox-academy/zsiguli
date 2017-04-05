import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayGround {

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
