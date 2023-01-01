import java.util.Scanner;

public class P2_Cat_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkMinutes = Integer.parseInt(scanner.nextLine());
        int walkCount = Integer.parseInt(scanner.nextLine());
        int calorieIntake = Integer.parseInt(scanner.nextLine());

        int walkTotalMinutes = walkMinutes * walkCount;
        int caloriesBurnedPerDay = walkTotalMinutes * 5;
        double caloriesToBurn = calorieIntake * 0.50;

        if (caloriesBurnedPerDay >= caloriesToBurn) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",caloriesBurnedPerDay);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurnedPerDay);
        }
    }
}
