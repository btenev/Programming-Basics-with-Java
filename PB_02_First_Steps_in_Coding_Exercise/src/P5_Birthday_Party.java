import java.util.Scanner;

public class P5_Birthday_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double cake = hallRent * 0.20;
        double drinks = cake - (0.45 * cake);
        double animator = (hallRent / 3.00);

        double budget = hallRent + cake + drinks + animator;

        System.out.println(budget);
    }
}
