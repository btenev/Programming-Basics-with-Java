import java.util.Scanner;

public class P8_Pet_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsNumber = Integer.parseInt(scanner.nextLine());
        int  otherAnimalsNumber = Integer.parseInt(scanner.nextLine());

        double dogFoodTotalPrice = dogsNumber * 2.50;
        int otherAnimalsTotalPrice = otherAnimalsNumber * 4;

        double totalPriceAll = dogFoodTotalPrice + otherAnimalsTotalPrice;

        System.out.printf("%.2f lv", totalPriceAll);
    }
}
