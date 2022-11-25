import java.util.Scanner;

public class P6_Godzilla_Vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double stageSet = filmBudget * 0.10;

        if (extras > 150) {
            clothingPrice *= 0.90;
        }

        double clothingPriceAll = clothingPrice * extras;
        double filmExpenses = clothingPriceAll + stageSet;


        if (filmExpenses > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", filmExpenses-filmBudget);
        } else {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget - filmExpenses);
        }
    }
}
