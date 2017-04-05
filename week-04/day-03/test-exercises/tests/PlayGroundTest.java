import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PlayGroundTest {

  @Test
  public void testLetterCounter() throws Exception {
    Map<String, Integer> map = PlayGround.letterCounter("Test string!");
    Map<String, Integer> controlMap = new HashMap<>();
    controlMap.put("T", 1);
    controlMap.put("e", 1);
    controlMap.put("s", 2);
    controlMap.put("t", 2);
    controlMap.put(" ", 1);
    controlMap.put("r", 1);
    controlMap.put("i", 1);
    controlMap.put("n", 1);
    controlMap.put("g", 1);
    controlMap.put("!", 1);

    assertEquals(controlMap, map);
  }

  @Test
  public void testApples() throws Exception {
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