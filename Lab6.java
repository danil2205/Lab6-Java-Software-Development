import flowers.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
1131 - zalikova
1131 % 13 = 0 => C13 = Визначити ієрархію квітів. Створити кілька об'єктів-квітів. Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
Провести сортування квітів у букеті за рівнем свіжості. Знайти квітку в букеті, що відповідає заданому діапазону довжин.
*/

/**
 * The `Lab6` class represents the main application to manage and display a bouquet of flowers.
 */
public class Lab6 {
  /**
   * The main method that runs the application.
   *
   * @param args The command-line arguments (not used in this application).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bouquet bouquet = new Bouquet();
    int min, max;

    Flowers lilyFresh = new Lily(50, 25, 1);
    Flowers rose = new Rose(150, 20, 1);
    Flowers lilyOld = new Lily(20, 40, 3);
    Flowers tulip = new Tulip(40, 30, 2);

    Accessory ribbon = new Accessory("Ribbon", 200);
    Accessory wrappingPaper = new Accessory("Wrapping Paper", 300);

    bouquet.addFlowersToBouquet(lilyFresh);
    bouquet.addFlowersToBouquet(rose);
    bouquet.addFlowersToBouquet(lilyOld);
    bouquet.addFlowersToBouquet(tulip);

    bouquet.addAccessory(ribbon);
    bouquet.addAccessory(wrappingPaper);

    // displaying all flowers
    System.out.println("All flowers:");
    bouquet.displayFlowers(bouquet.getBouquetOfFlowers());
    System.out.println("======================================");

    // price of bouquet
    System.out.printf("Price of bouquet: %d\n", bouquet.getPriceOfBouquet());
    System.out.println("======================================");

    // sorting
    System.out.println("\nSorted array of flowers by freshness: ");
    ArrayList<Flowers> sortedBouquet = bouquet.sortByFreshness();
    bouquet.displayFlowers(sortedBouquet);
    System.out.println("======================================");

    // finding flowers in range of lengths
    do {
      System.out.print("Enter the min length: ");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter an integer.");
        scanner.next();
      }
      min = scanner.nextInt();

      System.out.print("Enter the max length: ");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter an integer.");
        scanner.next();
      }
      max = scanner.nextInt();

    } while (min > max || min < 0); {
      System.out.println();
      bouquet.displayFlowers(bouquet.findingFlowersByLengths(min, max));
    }
  }
}
