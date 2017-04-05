import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  @Test
  public void getApple() throws Exception {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());
  }

}