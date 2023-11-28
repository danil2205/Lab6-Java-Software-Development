import flowers.Flowers;
import flowers.Lily;
import flowers.Rose;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BouquetTests {

  @Test
  void testAddFlowersToBouquet() {
    Bouquet bouquet = new Bouquet();
    Flowers lilyFresh = new Lily(50, 25, 1);
    bouquet.addFlowersToBouquet(lilyFresh);
    assertEquals(1, bouquet.getBouquetOfFlowers().size());
    assertTrue(bouquet.getBouquetOfFlowers().contains(lilyFresh));
  }

  @Test
  void testAddAccessory() {
    Bouquet bouquet = new Bouquet();
    Accessory ribbon = new Accessory("Ribbon", 200);
    bouquet.addAccessory(ribbon);
    assertEquals(1, bouquet.getAccessories().size());
    assertTrue(bouquet.getAccessories().contains(ribbon));
  }

  @Test
  void testGetPriceOfBouquet() {
    Bouquet bouquet = new Bouquet();
    Flowers lilyFresh = new Lily(50, 25, 1);
    Flowers rose = new Rose(150, 20, 1);
    Accessory wrappingPaper = new Accessory("Wrapping Paper", 300);
    bouquet.addFlowersToBouquet(lilyFresh);
    bouquet.addFlowersToBouquet(rose);
    bouquet.addAccessory(wrappingPaper);

    int expectedPrice = lilyFresh.getTotalPrice() + rose.getTotalPrice() + wrappingPaper.getPrice();
    assertEquals(expectedPrice, bouquet.getPriceOfBouquet());
  }

  @Test
  void testSortByFreshness() {
    Bouquet bouquet = new Bouquet();
    Flowers lilyFresh = new Lily(50, 25, 3);
    Flowers rose = new Rose(150, 20, 2);
    bouquet.addFlowersToBouquet(lilyFresh);
    bouquet.addFlowersToBouquet(rose);

    ArrayList<Flowers> sortedList = bouquet.sortByFreshness();
    assertTrue(sortedList.get(0).getLevelOfFreshness() <= sortedList.get(1).getLevelOfFreshness());
  }

  @Test
  void testFindingFlowersByLengths() {
    Bouquet bouquet = new Bouquet();
    Flowers lilyFresh = new Lily(10, 5, 3);
    Flowers rose = new Rose(20, 8, 2);
    bouquet.addFlowersToBouquet(lilyFresh);
    bouquet.addFlowersToBouquet(rose);

    ArrayList<Flowers> result = bouquet.findingFlowersByLengths(6, 10);

    assertEquals(1, result.size());
    assertEquals(rose, result.get(0));
  }
}
