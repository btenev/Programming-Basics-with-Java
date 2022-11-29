import java.util.Scanner;

public class P5_Divide_Without_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Дадени са n-на брой цели числа в интервала [1…1000]. От тях някакъв процент p1 се делят без остатък на 2,
        // друг процент p2 се делят без остатък на 3, друг процент p3 се делят без остатък на 4. Да се напише програма,
        // която изчислява и отпечатва процентите p1, p2 и p3.
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;


        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value % 2 == 0) {
                p1 += 1;
            }
            if (value % 3 == 0) {
                p2 += 1;
            }
            if (value % 4 == 0) {
                p3 += 1;
            }
        }
        double p1Percentage = (p1 * 1.0 / n) * 100;
        double p2Percentage = (p2 * 1.0 / n) * 100;
        double p3Percentage = (p3 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n",p1Percentage);
        System.out.printf("%.2f%%%n",p2Percentage);
        System.out.printf("%.2f%%%n",p3Percentage);
    }
}
