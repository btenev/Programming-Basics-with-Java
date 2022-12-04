import java.util.Scanner;

public class P2_Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int number = startNumber; number <= endNumber; number++) {
            int oddSum = 0;
            int evenSum = 0;
            String currentNumber = "" + number; // прешръщаме настоящият номер в текст за да достъпим отделните цифри;

            for (int j = 0; j <= currentNumber.length() - 1; j++) {  // минавам през всички позиции
                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j)); // Превръщаме конкретната позиция в цифра
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(number + " ");
            }

        }
    }

}

