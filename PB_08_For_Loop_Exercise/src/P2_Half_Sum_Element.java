import java.util.Scanner;

public class P2_Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
        // и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
        // Ако има такъв елемент, печата "Yes", "Sum = "  + неговата стойност; иначе печата "No", "Diff = " + разликата
        // между най-големия елемент и сумата на останалите (по абсолютна стойност).
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;

            if (max < value) {
                max = value;
            }
        }
        int sumWithoutMaxValue = sum - max;

        if (sumWithoutMaxValue == max) {
            System.out.printf("Yes%n");
            System.out.println("Sum = "  + max);
        } else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(max - sumWithoutMaxValue));
        }
    }
}

