import java.util.Scanner;

public class P8_Toy_Shop_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int jigsawCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());


        double profitAllToys = (jigsawCount * 2.60) + (talkingDollsCount * 3) + (teddyBearsCount * 4.10) + (minionsCount * 8.20) + (trucksCount * 2);
        int countAllToys = jigsawCount + talkingDollsCount + teddyBearsCount + minionsCount + trucksCount;

        if (countAllToys >= 50) {
             profitAllToys *= 0.75;
        }

        profitAllToys *= 0.90;

        if (profitAllToys >= tripPrice) {
            double leftAmount = profitAllToys - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftAmount);
        } else {
            double missSum = tripPrice - profitAllToys;
            System.out.printf("Not enough money! %.2f lv needed.", missSum);
        }


    }
}
