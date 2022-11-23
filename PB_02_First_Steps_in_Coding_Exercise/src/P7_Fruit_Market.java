import java.util.Scanner;

public class P7_Fruit_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice - (strawberryPrice * 0.50);
        double orangePrice = raspberryPrice - (raspberryPrice * 0.40);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.80);

        double strawberryExpense = strawberryPrice * strawberryKg;
        double bananaExpense = bananaPrice * bananasKg;
        double orangeExpense = orangePrice * orangesKg;
        double raspberryExpense = raspberryPrice * raspberryKg;

        double totalExpense = strawberryExpense + bananaExpense + orangeExpense + raspberryExpense;

        System.out.printf("%.2f",totalExpense);

    }
}
