import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countWine = 300;
        int countBeer = 200;
        int beerDelivery = 0;
        int beerOrders = 0;
        int wineDelivery = 0;
        int wineOrders = 0;

        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] arr = input.split(": ");
            String name = arr[0];
            int count = Integer.parseInt(arr[1]);
            if (name.equals("Wines")) {
                countWine += count;
                if (count < 0) {
                    wineOrders++;
                } else if (count > 0) {
                    wineDelivery++;
                }
            } else if (name.equals("Beers")) {
                countBeer += count;
                if (count < 0) {
                    beerOrders++;
                } else if (count > 0) {
                    beerDelivery++;
                }
            }

            input = scan.nextLine();
        }
        System.out.printf("Wines: %d%n", countWine);
        System.out.printf("Deliveries: %d%n", wineDelivery);
        System.out.printf("Orders: %d%n", wineOrders);
        System.out.printf("Beers: %d%n", countBeer);
        System.out.printf("Deliveries: %d%n", beerDelivery);
        System.out.printf("Orders: %d%n", beerOrders);


    }
}
