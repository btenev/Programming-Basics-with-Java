import java.util.Scanner;

public class P4_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value < 200) {
                p1 += 1;
            } else if (value >= 200 && value <= 399) {
                p2 += 1;
            } else if (value > 399 && value <= 599) {
                p3 += 1;
            } else if (value > 599 && value<= 799 ) {
                p4 += 1;
            } else if (value >= 800) {
                p5 += 1;
            }
        }
        double p1Percentage = (p1 * 1.00 / n) * 100;
        double p2Percentage = (p2 * 1.00 / n) * 100;
        double p3Percentage = (p3 * 1.00 / n) * 100;
        double p4Percentage = (p4 * 1.00/ n) * 100;
        double p5Percentage = (p5 * 1.00 / n) * 100;

        System.out.printf("%.2f%%%n",p1Percentage);
        System.out.printf("%.2f%%%n",p2Percentage);
        System.out.printf("%.2f%%%n",p3Percentage);
        System.out.printf("%.2f%%%n",p4Percentage);
        System.out.printf("%.2f%%%n",p5Percentage);

    }
}
