import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class PlayGroundTest {

  @Test
  public void apples() throws Exception {
    PlayGround playGround = new PlayGround();
    assertEquals("apple", playGround.getApple());
  }

  @Test
  public void sum() throws Exception {
    PlayGround a = new PlayGround();
    List<Integer> numbers;
    numbers = Arrays.asList(4,5,4,3,2);
    assertEquals((long) 18, (long) a.sum(numbers));
  }
}