/**
 * The `Accessory` class represents an accessory with a name and a price.
 * It provides methods to retrieve the name and price of the accessory.
 */
public class Accessory {
  private final String name;
  private final int price;

  /**
   * Constructs a new Accessory with the specified name and price.
   *
   * @param name  the name of the accessory
   * @param price the price of the accessory
   */
  public Accessory(String name, int price) {
    this.name = name;
    this.price = price;
  }

  /**
   * Returns the name of the accessory.
   *
   * @return the name of the accessory
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the price of the accessory.
   *
   * @return the price of the accessory
   */
  public int getPrice() {
    return price;
  }
}