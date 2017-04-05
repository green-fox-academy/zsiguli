import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayGround {

  public String getApple() {
    return "apple";
  }

  public Long sum(List<Integer> numbers) {
    long result = 0;
    for (Integer num : numbers) {
      result += num;
    }
    return result;
  }
}
