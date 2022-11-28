import java.util.Scanner;

public class P4_Even_Powers_Of_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // степени от 0 до n
        // повторяме: печатаме 2 на дадена степен
        // начална стойност: o
        // крайна стойност: n
        // повторение: увеличаваме с 2
        int n = Integer.parseInt(scanner.nextLine());

        for (int power = 0; power <= n; power += 2) {
            System.out.printf("%.0f%n",Math.pow(2, power));
        }
    }
}
