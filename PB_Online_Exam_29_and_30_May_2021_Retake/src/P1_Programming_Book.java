import java.util.Scanner;

public class P1_Programming_Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double priceMainPage = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double paymentDesigner = Double.parseDouble(scanner.nextLine());
        int percentPaidByTeam = Integer.parseInt(scanner.nextLine());

        double startingPrice = pricePerPage * 899 + priceMainPage * 2;
        double discount = startingPrice * (percentDiscount * 1.00 / 100);
        double discountedPrice = startingPrice - discount;
        double totalPrice = discountedPrice + paymentDesigner;
        double paidByTeam= totalPrice * (percentPaidByTeam * 1.00 / 100);
        double finalPrice = totalPrice - paidByTeam;

        System.out.printf("Avtonom should pay %.2f BGN.", finalPrice);
    }
}
