import java.util.Scanner;

public class P7_Hotel_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double nightPriceApartment = 0;
        double nightPriceStudio = 0;

        switch (month) {
            case "May":
            case "October":
                nightPriceStudio = 50;
                nightPriceApartment = 65;
                if (nightsCount > 7 && nightsCount <=14) {
                    nightPriceStudio *= 0.95;
                } else if (nightsCount > 14) {
                    nightPriceStudio *= 0.70;
                    nightPriceApartment *= 0.90;
                }
                break;
            case "June":
            case "September":
                nightPriceStudio = 75.20;
                nightPriceApartment = 68.70;
                if (nightsCount > 14) {
                    nightPriceStudio *= 0.80;
                    nightPriceApartment *= 0.90;
                }
                break;
            case "July":
            case "August":
                nightPriceStudio = 76;
                nightPriceApartment = 77;
                if (nightsCount > 14) {
                    nightPriceApartment *= 0.90;
                }
                break;
        }
        double finalPriceStudio = nightsCount * nightPriceStudio;
        double finalPriceApartment = nightsCount * nightPriceApartment;

        System.out.printf("Apartment: %.2f lv.%n", finalPriceApartment);
        System.out.printf("Studio: %.2f lv.", finalPriceStudio);

    }
}
