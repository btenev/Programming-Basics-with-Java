import java.util.Scanner;

public class P9_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int numberWeekendsSofia = 48 - h;
        double gamesSofiaSaturday = numberWeekendsSofia * (3.0 / 4);
        double gamesSofiaHolidays = p * (2.0 / 3);
        double gamesTotal = gamesSofiaSaturday + gamesSofiaHolidays + h;

        if (year.equals("leap")) {
            gamesTotal += gamesTotal * 0.15;
        }
        System.out.println(Math.floor(gamesTotal));
    }
}

