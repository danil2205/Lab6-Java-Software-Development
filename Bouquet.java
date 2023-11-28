import flowers.Flowers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * The `Bouquet` class represents a collection of flowers.Flowers and provides methods to manage and
 * perform operations on the flowers in the bouquet.
 */
public class Bouquet {
  private final ArrayList<Flowers> bouquetOfFlowers = new ArrayList<>();
  private final ArrayList<Accessory> accessories = new ArrayList<>();

  /**
   * Gets the bouquet of the flowers.
   *
   * @return The bouquet of the flowers.
   */
  public ArrayList<Flowers> getBouquetOfFlowers() {
    return this.bouquetOfFlowers;
  }

  /**
   * Adds a flowers to the bouquet.
   *
   * @param flowers The flowers to add to the bouquet.
   */
  public void addFlowersToBouquet(Flowers flowers) {
    this.bouquetOfFlowers.add(flowers);
  }

  /**
   * Adds an accessory to the bouquet.
   *
   * @param accessory The accessory to add to the bouquet.
   */
  public void addAccessory(Accessory accessory) {
    accessories.add(accessory);
  }

  /**
   * Gets the accessories.
   *
   * @return The accessories.
   */
  public ArrayList<Accessory> getAccessories() {
    return this.accessories;
  }

  /**
   * Display flowers in the bouquet.
   *
   * @param flowersList The flowers to display.
   */
  public void displayFlowers(ArrayList<Flowers> flowersList) {
    for (Flowers flowers : flowersList) System.out.println(flowers);
  }

  /**
   * Gives the total price of flowers in bouquet.
   *
   * @return The total price of the bouquet.
   */
  public int getPriceOfBouquet() {
    int priceOfBouquet = 0;
    for (Flowers flower : this.bouquetOfFlowers) {
      priceOfBouquet += flower.getTotalPrice();
    }
    for (Accessory accessory : this.accessories) {
      priceOfBouquet += accessory.getPrice();
    }
    return priceOfBouquet;
  }

  /**
   * Sorts flowers in the bouquet by their freshness in ascending order.
   *
   * @return The ArrayList sorted by freshness of flowers in the bouquet.
   */
  public ArrayList<Flowers> sortByFreshness() {
    Flowers[] copiedArray = this.bouquetOfFlowers.toArray(new Flowers[0]);
    Arrays.sort(copiedArray, Comparator.comparingInt(Flowers::getLevelOfFreshness));
    return new ArrayList<>(Arrays.asList(copiedArray));
  }

  /**
   * Finds and returns a list of flowers in the bouquet within a specified range.
   *
   * @param min The minimum length of flower.
   * @param max The maximum length of flower.
   */
  public ArrayList<Flowers> findingFlowersByLengths(int min, int max) {
    ArrayList<Flowers> flowersByLengths = new ArrayList<>();
    for (Flowers flower : this.bouquetOfFlowers) {
      if (flower.getLength() > min && flower.getLength() < max) {
        flowersByLengths.add(flower);
      }
    }

    return flowersByLengths;
  }
}
