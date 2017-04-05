import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

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
    PlayGround playGround = new PlayGround();
    List<Integer> numbers;
    numbers = Arrays.asList(4,5,4,3,2);
    assertEquals((long) 18, (long) playGround.sum(numbers));
  }

  @Test
  public void sumWithNull() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers = new ArrayList<>();
    assertEquals((long) 0, (long) playGround.sum(numbers));
  }

  @Test
  public void sumWithZero() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    assertEquals((long) 0, (long) playGround.sum(numbers));
  }
}