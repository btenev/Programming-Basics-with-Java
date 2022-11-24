import java.util.Scanner;

public class P4_Number_100_200 {
    public static void main(String[] args) {
        // 1. цяло число, конзола
        // 2. проверяваме дали под 100
        // 3. ако не друго над 200
        // 4. в противен случай между 100 и 200

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}
