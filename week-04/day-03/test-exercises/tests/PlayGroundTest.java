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
  public void testSum() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers;
    numbers = Arrays.asList(4,5,4,3,2);
    assertEquals(18, playGround.sum(numbers));
  }

  @Test
  public void testSumWithOneNumber() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers;
    numbers = Arrays.asList(5);
    assertEquals(5, playGround.sum(numbers));
  }

  @Test
  public void testSumWithNull() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers = new ArrayList<>();
    assertEquals(0, playGround.sum(numbers));
  }

  @Test
  public void testSumWithZero() throws Exception {
    PlayGround playGround = new PlayGround();
    List<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    assertEquals(0, playGround.sum(numbers));
  }
}