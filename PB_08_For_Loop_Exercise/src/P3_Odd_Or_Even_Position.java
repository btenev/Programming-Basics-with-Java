import java.util.Scanner;

public class P3_Odd_Or_Even_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        double oddMin = 1000000000.0 ;
        double oddMax = -1000000000.0;
        double oddSum = 0;
        double evenMin = 1000000000.0 ;
        double evenMax = -1000000000.0;
        double evenSum = 0;

        for (int number = 1; number <= n; number++) {
            double value = Double.parseDouble(scanner.nextLine());
            if (number % 2 == 0) {
                if (value > evenMax) {
                    evenMax = value;
                }
                if (value < evenMin ) {
                    evenMin = value;
                }
                evenSum += value;
            } else {
                if (value > oddMax) {
                    oddMax = value;
                }
                if (value < oddMin ) {
                    oddMin = value;
                }
                oddSum += value;
            }
        }
        System.out.printf("OddSum=%.2f,%n",oddSum);

        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n",oddMin);
        }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n",evenSum);
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == -1000000000.0 ) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n" , evenMax);
        }
    }
}
