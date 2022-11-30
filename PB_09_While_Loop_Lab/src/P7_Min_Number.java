import java.util.Scanner;

public class P7_Min_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        // спираме: input == Stop
        // продължаваме: input != Stop
        // повтаряме: въвеждане на числа от потребителя, сравняваме числата < са от мин
        // променяме: ново число

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < minNumber) {
                minNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
