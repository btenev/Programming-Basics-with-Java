import java.util.Scanner;

public class P3_Sum_Prime_Non_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;



        while (!text.equals("stop")) {
            int number = Integer.parseInt(text);
            boolean isPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int current = 2; current <= Math.sqrt(number); current++) {  // проверява дали числот се дели на друго освен себе си и 1
                    if (number % current == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sumPrime += number;
                } else {
                    sumNonPrime += number;
                }

            }
            text = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}