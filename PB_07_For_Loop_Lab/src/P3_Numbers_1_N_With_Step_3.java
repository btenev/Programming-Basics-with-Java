import java.util.Scanner;

public class P3_Numbers_1_N_With_Step_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // отпечатваме числата от 1 до N през 3
        // повторяме: печатаме на число
        // начална стойност: 1
        // крайна стойност: n
        // повторение: увеличение с 3

        for (int number = 1; number <= n; number+=3) {
            System.out.println(number);
        }
    }
}
