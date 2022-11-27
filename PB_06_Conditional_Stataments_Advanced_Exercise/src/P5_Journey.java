import java.util.Scanner;

public class P5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	При 100лв. или по-малко – някъде в България
        //o	Лято – 30% от бюджета
        //o	Зима – 70% от бюджета
        //•	При 1000лв. или по малко – някъде на Балканите
        //o	Лято – 40% от бюджета
        //o	Зима – 80% от бюджета
        //•	При повече от 1000лв. – някъде из Европа
        //o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String place = "";

        if (budget <= 100) {
             destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                budget *= 0.30;
            } else if (season.equals("winter")) {
                place = "Hotel";
                budget *= 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                budget *= 0.40;
            } else if (season.equals("winter")) {
                place = "Hotel";
                budget *= 0.80;
            }
        } else if (budget > 1000) {
            destination = "Europe";
                place = "Hotel";
                budget *= 0.90;
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f", place, budget);
    }
}
