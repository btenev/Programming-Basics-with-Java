import java.util.Scanner;

public class P9_Yard_Greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cubicMetersGreening = Double.parseDouble(scanner.nextLine());

        double priceGreening = cubicMetersGreening * 7.61;
        double discount = priceGreening * 0.18;
        double finalPrice = priceGreening - discount;

        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);


    }
}
