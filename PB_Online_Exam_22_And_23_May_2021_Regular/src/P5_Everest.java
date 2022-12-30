import java.util.Scanner;

public class P5_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int daysPassed = 1;
        int meterClimbedTotal = 5364;
        boolean isClimbed = false;

        while (!text.equals("END")) {
            int metersClimbed = Integer.parseInt(scanner.nextLine());

            if (text.equals("Yes")) {
                daysPassed += 1;
            }

            if (daysPassed > 5) {
                break;
            }
            meterClimbedTotal += metersClimbed;
            if (meterClimbedTotal >= 8848) {
                isClimbed = true;
                break;
            }
            text = scanner.nextLine();
        }
        if (isClimbed) {
            System.out.println("Goal reached for " + daysPassed + " days!");
        } else {
            System.out.println("Failed!");
            System.out.println(meterClimbedTotal);
        }
    }
}
