import java.util.Scanner;

public class P9_Left_And_Right_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumRight = 0;
        int sumLeft = 0;

        for (int number = 1; number <= 2 * n; number++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (number <= n) {
                sumRight += input;
            } else {
                sumLeft += input;
            }
        }


        if (sumRight  == sumLeft) {
            System.out.printf("Yes, sum = %d",sumRight);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumRight - sumLeft));
        }
    }
}
