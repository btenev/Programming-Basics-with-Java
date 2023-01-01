import java.util.Scanner;

public class P2_Mountain_Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSek = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double sekPerMeter = Double.parseDouble(scanner.nextLine());

        double timeClimb = distanceMeters * sekPerMeter;
        double slowdown = Math.floor(distanceMeters / 50) * 30;
        double totalTime = timeClimb + slowdown;

        if (totalTime < recordSek) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordSek);
        }
    }
}
