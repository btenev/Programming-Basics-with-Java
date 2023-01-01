import java.util.Scanner;

public class P3_Fitness_Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableSum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double activityPrice = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    activityPrice = 42;
                } else if ((gender.equals("f"))) {
                    activityPrice = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    activityPrice = 41;
                } else if ((gender.equals("f"))) {
                    activityPrice = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    activityPrice = 45;
                } else if ((gender.equals("f"))) {
                    activityPrice = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    activityPrice = 34;
                } else if ((gender.equals("f"))) {
                    activityPrice = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    activityPrice = 51;
                } else if ((gender.equals("f"))) {
                    activityPrice = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    activityPrice = 39;
                } else if ((gender.equals("f"))) {
                    activityPrice = 37;
                }
                break;
        }
        if (age <= 19) {
            activityPrice *= 0.80;
        }

        if (availableSum >= activityPrice) {
            System.out.println("You purchased a 1 month pass for " + sport + ".");
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", activityPrice - availableSum);
        }
    }
}
