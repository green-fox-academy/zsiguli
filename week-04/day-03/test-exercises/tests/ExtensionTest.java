import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd() {
    assertEquals(8, extension.add(3, 5));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 3, 4));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(4, 5, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}