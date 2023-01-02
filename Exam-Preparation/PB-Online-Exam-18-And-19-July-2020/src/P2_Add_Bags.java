import java.util.Scanner;

public class P2_Add_Bags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baggagePriceOver20 = Double.parseDouble(scanner.nextLine());
        double baggageKilos = Double.parseDouble(scanner.nextLine());
        int daysTillDeparture = Integer.parseInt(scanner.nextLine());
        int baggageCount = Integer.parseInt(scanner.nextLine());
        double baggagePriceTotal = 0;

        if (baggageKilos < 10) {
            baggagePriceTotal += baggagePriceOver20 * 0.20;
        } else if (baggageKilos >= 10 && baggageKilos <= 20) {
            baggagePriceTotal += baggagePriceOver20 * 0.50;
        } else {
            baggagePriceTotal += baggagePriceOver20;
        }
        if (daysTillDeparture > 30) {
            baggagePriceTotal += baggagePriceTotal * 0.10;
        } else if (daysTillDeparture >= 7 && daysTillDeparture <= 30) {
            baggagePriceTotal += baggagePriceTotal * 0.15;
        } else {
            baggagePriceTotal += baggagePriceTotal * 0.40;
        }
        double total = baggageCount * baggagePriceTotal;
        System.out.printf("The total price of bags is: %.2f lv.",total);
    }
}
