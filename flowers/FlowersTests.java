package flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowersTests {
  @Test
  void testGetLength() {
    Flowers flowers = new Rose(10, 30, 1);
    assertEquals(30, flowers.getLength());
  }

  @Test
  void testSetAndGetTotalPrice() {
    Flowers flowers = new Lily(8, 25, 4);
    assertEquals(200, flowers.getTotalPrice());
  }

  @Test
  void testGetLevelOfFreshness() {
    Flowers flowers = new Rose(15, 15, 3);
    assertEquals(3, flowers.getLevelOfFreshness());
  }

  @Test
  void testToString() {
    Flowers flowers = new Lily(10, 13, 1);
    String expected = "Flower: Lily\nLength: 13\nTotal price: 130\nLevel of freshness: 1\n";
    assertEquals(expected, flowers.toString());
  }
}
