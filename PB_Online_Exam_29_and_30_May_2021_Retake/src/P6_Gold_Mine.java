import java.util.Scanner;

public class P6_Gold_Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());

        for (int firstLocation = 1; firstLocation <= locationCount; firstLocation++) {
            double expectedYield = Double.parseDouble(scanner.nextLine());
            int daysOfWork = Integer.parseInt(scanner.nextLine());
            double totalYield = 0;
            for (int firstDay = 1; firstDay <= daysOfWork; firstDay++) {
                double actualYield = Double.parseDouble(scanner.nextLine());
                totalYield += actualYield;
            }
            double averageYield = totalYield / daysOfWork;
            if (averageYield >= expectedYield) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageYield);
            } else {
                double less = expectedYield - averageYield;
                System.out.printf("You need %.2f gold.%n", less);
            }

        }

    }
}
