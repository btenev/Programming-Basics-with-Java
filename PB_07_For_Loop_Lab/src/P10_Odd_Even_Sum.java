import java.util.Scanner;

public class P10_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            if ( number % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }
        int sum = sumEven - sumOdd;

        if (sumEven == sumOdd) {
            System.out.printf("Yes%n");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.printf("No%n");
            System.out.println("Diff = " + Math.abs(sum));
        }
    }
}
