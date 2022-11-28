import java.util.Scanner;

public class P11_Clever_Lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyCount = 0;
        int money = 0;


        for (int number = 1; number <= age; number++ ) {
            if (number % 2 == 0) {
                money += (10 * number/2) -1;
            } else {
                toyCount += 1;
            }

        }
        int totalSum = (toyCount * toyPrice) + money;

        if (totalSum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f",totalSum - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f",washingMachinePrice - totalSum);
        }
    }
}
