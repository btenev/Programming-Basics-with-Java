import java.util.Scanner;

public class P4_Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double shipPrice = 0;
        double discount = 0;

        switch (season) {
            case "Spring":
                shipPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                break;
            default:
                break;
        }

        if (fishermanCount <= 6) {
            discount = 0.10;
        } else if (fishermanCount > 7 && fishermanCount <= 11) {
            discount = 0.15;
        } else if (fishermanCount > 12){
            discount = 0.25;
        }

        if (fishermanCount % 2 == 0 && !(season.equals("Autumn"))) {
            discount += 0.05;
        }

        double totalExpenses = shipPrice - (shipPrice * discount);

        if (budget >= totalExpenses) {
            System.out.printf("Yes! You have %.2f leva left.", budget-totalExpenses);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalExpenses-budget);
        }
    }
}
