import java.util.Scanner;

public class P4_Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        //•	Първи ред – начало на интервала – цяло число в интервала [1...999]
        //•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //•	Трети ред – магическото число – цяло число в интервала [1...10000]

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        int nFinal = 0;
        int mFinal = 0;
        boolean isFound = false;
        int counter = 0;

        for (int n = number1; n <= number2; n++) {

            for (int m = number1; m <= number2; m++) {
                counter++;
                if (magicalNumber == n + m) {
                    nFinal = n;
                    mFinal = m;
                    isFound = true;
                    break;
                }

            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, nFinal, mFinal, magicalNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicalNumber);
        }
    }
}
