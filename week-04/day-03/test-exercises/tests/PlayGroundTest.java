import org.junit.Test;
import static org.junit.Assert.*;

public class PlayGroundTest {

  @Test
  public void apples() throws Exception {
    PlayGround playGround = new PlayGround();
    assertEquals("apple", playGround.getApple());
  }
}