import java.util.Scanner;

public class P6_Charity_Campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int pastryChefs = Integer.parseInt(scanner.nextLine());
        int cakesNumber = Integer.parseInt(scanner.nextLine());
        int wafflesNumber = Integer.parseInt(scanner.nextLine());
        int pancakesNumber = Integer.parseInt(scanner.nextLine());

        double cakePrice = cakesNumber * 45;
        double wafflePrice = wafflesNumber * 5.80;
        double pancakePrice = pancakesNumber * 3.20;
        double sumChef = (cakePrice + wafflePrice + pancakePrice) * pastryChefs;

        double sumChefAll = sumChef * days;
        double ingredientPrice = sumChefAll / 8;

        double netValue = sumChefAll - ingredientPrice;

        System.out.printf("%.2f",netValue);


    }
}
