import java.util.Scanner;

public class P6_Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата се прочитат 3 реда, въведени от потребителя:
        //•	N1 – цяло число в интервала [0...40 000]
        //•	N2 – цяло число в интервала [0...40 000]
        //•	Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, result);
            }
                break;
            case "-":
                int result1 = n1 - n2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, result1);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, result1);
                }
                break;
            case "*":
                int result2 = n1 * n2;
                if (result2 % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, result2);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, result2);
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double result3 = (n1 * 1.0) / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, result3);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    int result4 = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, result4);
                }
                break;
        }
    }
}
