import java.util.Scanner;

public class P3_Santas_Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysSpent = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int nightsSpent = daysSpent - 1;
        double typeOfRoom = 0;

        switch (type) {
            case "room for one person":
                    typeOfRoom = 18.00;
                break;
            case "apartment":
                    typeOfRoom = 25.00;
                if (daysSpent < 10) {
                    typeOfRoom *= 0.70;
                } else if (daysSpent >= 10 && daysSpent <= 15) {
                    typeOfRoom *= 0.65;
                } else if (daysSpent > 15) {
                    typeOfRoom *= 0.50;
                }
                break;
            case "president apartment":
                    typeOfRoom = 35.00;
                if (daysSpent < 10) {
                    typeOfRoom *= 0.90;
                } else if (daysSpent >= 10 && daysSpent <= 15) {
                    typeOfRoom *= 0.85;
                } else if (daysSpent > 15) {
                    typeOfRoom *= 0.80;
                }
                break;
        }
        double priceStay = nightsSpent * typeOfRoom;

        if (evaluation.equals("positive")) {
            priceStay *= 1.25;
        } else {
            priceStay *= 0.90;
        }
        System.out.printf("%.2f", priceStay);
    }
}
