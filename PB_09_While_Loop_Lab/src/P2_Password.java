import java.util.Scanner;

public class P2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String input =  scanner.nextLine();

        // начална стойност: парола input
        // повтаряме: парола от потребител - input
        // крайна стойност: input = парола
        // продължаваме: input != парола
        // променяме: нова парола input

        while (!input.equals(password)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
