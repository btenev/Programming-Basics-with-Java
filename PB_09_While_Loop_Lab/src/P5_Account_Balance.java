import java.util.Scanner;

public class P5_Account_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double account = 0;
        String text = scanner.nextLine();

        // повторяме: внасяне на пари в сметка -> пробавяме пари към сметката, печатаме "Increase: " + сумата
        // спираме: text == “NoMoreMoney”
        // продължаваме text != “NoMoreMoney”
        // Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата да приключи

        while (!text.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(text);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                account += sum;
                System.out.printf("Increase: %.2f%n", sum);
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", account);
    }
}
