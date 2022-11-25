import java.util.Scanner;

public class P7_World_Swimming_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double resistanceTime1 = Math.floor(distance / 15); // additional time sec
        double resistanceTime2 = resistanceTime1 * 12.5;
        double time = distance * secondsPerMeter;
        double totalTime = resistanceTime2 + time;

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }

    }
}
