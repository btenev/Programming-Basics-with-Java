import java.util.Scanner;

public class P6_Unique_PIN_Codes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigitEnd = Integer.parseInt(scanner.nextLine());
        int secondDigitEnd = Integer.parseInt(scanner.nextLine());
        int thirdDigitEnd = Integer.parseInt(scanner.nextLine());

        for (int firstDigitStart = 1; firstDigitStart <= firstDigitEnd; firstDigitStart++) {
            if (firstDigitStart % 2 == 0) {
                for (int secondDigitStart = 2; secondDigitStart <= secondDigitEnd; secondDigitStart++) {
                    boolean prime = true;
                    for (int i = 2; i < secondDigitStart; i++) {
                        if (secondDigitStart % i == 0) {
                            prime = false;
                            break;

                        }
                    }
                    if (prime) {
                        for (int thirdDigitStart = 1; thirdDigitStart <= thirdDigitEnd; thirdDigitStart++) {
                            if (thirdDigitStart % 2 == 0) {
                                System.out.printf("%d %d% d%n", firstDigitStart, secondDigitStart, thirdDigitStart);
                            }
                        }
                    }

                }
            }

        }
    }
}