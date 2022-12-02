import java.util.Scanner;

public class P4_Sum_Of_Two_Numbers_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        //•	Първи ред – начало на интервала – цяло число в интервала [1...999]
        //•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //•	Трети ред – магическото число – цяло число в интервала [1...10000]

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int number1 = startNumber; number1 <= endNumber; number1++) {
            for (int number2 = startNumber; number2 <= endNumber; number2++) {
                counter++;
                if (number1 + number2 == magicalNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicalNumber);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicalNumber);
        }
    }
}
