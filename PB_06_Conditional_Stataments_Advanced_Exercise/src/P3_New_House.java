import java.util.Scanner;

public class P3_New_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0;
        double factor = 1;

        switch (flowerType) {
            case "Roses":
                flowerPrice = 5;
                if (flowerCount > 80) {
                    factor = 0.90;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                if (flowerCount > 90) {
                    factor = 0.85;
                }
                break;
            case "Tulips":
                flowerPrice = 2.80;
                if (flowerCount > 80) {
                    factor = 0.85;
                }
                break;
            case "Narcissus":
                flowerPrice = 3;
                if (flowerCount < 120) {
                    factor = 1.15;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.50;
                if (flowerCount < 80) {
                    factor = 1.20;
                }
                break;
        }
        double totalExpenses = (flowerPrice * flowerCount) * factor;

        if (budget >= totalExpenses) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerCount, flowerType, budget - totalExpenses);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget - totalExpenses));
        }

    }
}
